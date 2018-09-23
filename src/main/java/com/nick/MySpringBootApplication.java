package com.nick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.TomcatWebSocketServletWebServerCustomizer;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

@SpringBootApplication
//@EnableScheduling
@ComponentScan
@EnableAsync //启用异步
public class MySpringBootApplication extends AsyncConfigurerSupport {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	/**
	 * 继承AsyncConfigurerSupport， 重写其getAsyncExecutor 方法，设置线程池个数，将任务改为多线程执行
	 * @return
	 */
	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("Async-");
		executor.initialize();
		return executor;
	}

	/**
	 * 通过代码配置内置servlet容器
	 */
	/*@Component
	public static class CustomServletContainer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
		@Override
		public void customize(ConfigurableServletWebServerFactory configurableServletWebServerFactory) {
			configurableServletWebServerFactory.setContextPath("/nick"); //相当于yml中的server.context-path: /nick
			configurableServletWebServerFactory.setPort(8012); //相当于yml中的server.port: 8012
		}
	}*/
}
