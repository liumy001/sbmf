package com.meeting.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by liumy on 2016/9/24.
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}
