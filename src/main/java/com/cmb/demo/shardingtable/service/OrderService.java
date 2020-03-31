package com.cmb.demo.shardingtable.service;


import com.cmb.demo.shardingtable.entity.Order;
import com.cmb.demo.shardingtable.mapper.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService  {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * 保存用户信息
     *
     * @param entity
     * @return
     */
    public void save(Order entity){
        orderRepository.save(entity);
    };

    /**
     * 查询全部订单信息
     *
     * @return
     */
    public List<Order> getOrderList(){
       return  orderRepository.findAll();
    };

    /**
     * 根据商户id查询
     *
     * @return
     */
    public List<Order> getOrderListByMid(String mid){
        return  orderRepository.findByMid(mid);
    };
}