package com.example.demo.preandpost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/1/14 11:00
 */

@Configuration
@ComponentScan("com.example.demo.preandpost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanWayInitAndDestroy beanWayInitAndDestroy(){
        return new BeanWayInitAndDestroy();
    }
}
