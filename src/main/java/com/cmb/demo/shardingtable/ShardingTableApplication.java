package com.cmb.demo.shardingtable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
//@MapperScan("com.cmb.demo.shardingtable.mapper")
public class ShardingTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingTableApplication.class, args);
    }

}
