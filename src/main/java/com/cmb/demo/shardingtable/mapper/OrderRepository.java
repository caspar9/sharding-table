package com.cmb.demo.shardingtable.mapper;

import com.cmb.demo.shardingtable.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String>, CrudRepository<Order, String>, JpaSpecificationExecutor {
    List<Order> findByMid(String mid);
}
