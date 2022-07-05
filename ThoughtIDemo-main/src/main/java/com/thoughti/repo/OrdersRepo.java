package com.thoughti.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughti.model.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
