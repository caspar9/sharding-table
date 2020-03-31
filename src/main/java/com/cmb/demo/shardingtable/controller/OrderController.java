package com.cmb.demo.shardingtable.controller;

import com.cmb.demo.shardingtable.entity.Order;
import com.cmb.demo.shardingtable.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService userService;

    @GetMapping("/select")
    public List<Order> select() {
        return userService.getOrderList();
    }

    @GetMapping("/select/{mid}")
    public List<Order> select(@PathVariable("mid") String mid) {
        return userService.getOrderListByMid(mid);
    }

    @GetMapping("/insert")
    public void insert(Order order) {
        userService.save(order);
    }
}
