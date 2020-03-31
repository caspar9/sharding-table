package com.cmb.demo.shardingtable.config;

import com.cmb.demo.shardingtable.utils.SpringContextUtil;
import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Map;

@Setter
@Getter
public class OrderInfoShardingAlgorithm implements PreciseShardingAlgorithm<String> {

    private String tableName = "order_";

    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<String> shardingValue) {

        ShardingConfiguration shardingConfiguration = SpringContextUtil.getBean(ShardingConfiguration.class);

        String mid = shardingValue.getValue();
        int tbIndex = shardingConfiguration.getTbindex().intValue();
        Map<String, String> orderTbMap = shardingConfiguration.getTableMapping();


        if (orderTbMap.keySet().contains(mid) && availableTargetNames.contains(tableName + orderTbMap.get(mid))) {
            return tableName + orderTbMap.get(mid);
        }


        int index = (Math.abs(mid.hashCode()) % tbIndex);
        if (availableTargetNames.contains(tableName + index)) {
            return tableName + index;
        }

        throw new UnsupportedOperationException("无法获取分片表: " + shardingValue.getValue());
    }
}
