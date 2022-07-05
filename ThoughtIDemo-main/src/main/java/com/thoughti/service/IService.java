package com.thoughti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thoughti.model.Orders;

@Service
public interface IService {
	public abstract List<Orders> placeOrder(List<Orders> order);
	
	public abstract List<Orders> getAllOrders();
	
	public abstract Optional<Orders> getAllOrders(int order_id);
	
}
