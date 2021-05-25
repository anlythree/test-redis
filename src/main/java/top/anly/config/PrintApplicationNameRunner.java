package top.anly.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author wangli
 * @date 2021/5/25 21:26
 */
@Component
public class PrintApplicationNameRunner implements ApplicationRunner {

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(applicationName + "项目启动成功！！！");
    }
}
