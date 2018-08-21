package com.nick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

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
}
