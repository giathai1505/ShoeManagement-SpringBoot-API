package net.codejava.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.models.OrderDetail;
import net.codejava.models.Product;
import net.codejava.repositories.OrderDetailRepository;
import net.codejava.services.OrderDetailService;
import net.codejava.services.ProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class OrderDetailController {
	@Autowired
	private OrderDetailService service;
		
	@GetMapping("/orderDetails")
	public List<OrderDetail> list() {
		return service.listAll();
	}
	
	@GetMapping("/orderDetails/order/{orderId}")
	public List<OrderDetail> listOrderDetailByOrder(@PathVariable Integer orderId) {
//		try {
//			List<OrderDetail> orderDetail = service.getOrderDetailByOrderId(orderId);
//			return new List<OrderDetail>(orderDetail, HttpStatus.OK);
//		} catch (NoSuchElementException e) {
//			return new List<OrderDetail>(HttpStatus.NOT_FOUND);
//		}
		return service.getOrderDetailByOrderId(orderId);
	}
}
