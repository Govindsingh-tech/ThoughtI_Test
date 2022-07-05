package com.thoughti.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.thoughti.model.Item;
import com.thoughti.model.Orders;
import com.thoughti.repo.ItemsRepo;
import com.thoughti.repo.OrdersRepo;
import com.thoughti.service.IService;

@RestController
@RequestMapping("/order")
public class MainController {

	@Autowired
	private IService iService;
	
	@PostMapping("/create")
	public String placeOrder(@RequestBody List<Orders> order) {
		iService.placeOrder(order);
		return "SUCCESS";
	}
	
	@GetMapping("/orders")
	@ResponseStatus()
	public ResponseEntity<Response> getAllOrders(){
		
		return new ResponseEntity(iService.getAllOrders(),HttpStatus.OK);
	}
	@GetMapping("/orders/{order_id}")
	public Optional<Orders> getAllOrders(@PathVariable int order_id){
		
		
		return iService.getAllOrders(order_id);
	}
}
