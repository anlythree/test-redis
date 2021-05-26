package top.anly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 *
 * @author wangli
 * @date 2021/5/25 21:22
 */
@EnableRedisHttpSession
@SpringBootApplication
public class TestRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(top.anly.TestRedisApplication.class, args);
    }
}
