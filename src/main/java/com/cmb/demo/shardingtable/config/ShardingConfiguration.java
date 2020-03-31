package com.cmb.demo.shardingtable.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "sharding.jdbc.config.sharding.tables.order")
@Getter
@Setter
public class ShardingConfiguration {

    private Integer tbindex;

    private Map<String, String> tableMapping;

}
