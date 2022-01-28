package com.demo.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：配置类,将DemoService类定义为一个Bean，交给Ioc容器。
 **/
@Configuration
// @EnableConfigurationProperties注解,DemoProperties中@ConfigurationProperties注解配置Bean的支持
// 也就是@EnableConfigurationProperties注解告诉SpringBoot能支持@ConfigurationProperties
// 也可以在@ConfigurationProperties注解的类上添加@Configuration或者@Component注解,让它暴露给Spring
@EnableConfigurationProperties(DemoProperties.class)
// @ConditionalOnProperty注解控制@Configuration是否生效,简单来说也就是我们可以通过在yml配置文件中控制@Configuration注解的配置类是否生效
@ConditionalOnProperty(
        prefix = "demo",
        name = "isopen",
        havingValue = "true"
)
public class DemoConfig {
    @Autowired
    private DemoProperties demoProperties;

    @Bean(name = "demo")
    public DemoService demoService(){
        return new DemoService(demoProperties.getSayWhat(), demoProperties.getToWho());
    }
}