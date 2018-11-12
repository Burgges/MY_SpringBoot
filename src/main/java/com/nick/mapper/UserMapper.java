package com.nick.mapper;

import com.nick.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nick.Chen on 2018/10/31 0031.
 *
 */
public interface UserMapper extends JpaRepository<User, Long> {
}
