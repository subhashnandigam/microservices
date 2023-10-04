package com.subhash.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.orderservice.model.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
