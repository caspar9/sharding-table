package com.cmb.demo.shardingtable.config;

import com.cmb.demo.shardingtable.utils.SpringContextUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContextConfiguration {

    @Bean
    public SpringContextUtil getSpringContextUtil() {
        return new SpringContextUtil();
    }
}