package com.cmb.demo.shardingtable.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@Slf4j
@Entity
@Table(name = "order")
public class Order {

    @Id
//    @GeneratedValue(generator = "orderGenerator")
//    @GenericGenerator(name = "orderGenerator", strategy = "assigned")
//    @Column(length = 64)
    private String id;

    /**
     * 商户ID
     */
    private String mid;
}
