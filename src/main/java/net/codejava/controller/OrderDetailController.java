package net.codejava.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.models.OrderDetail;
import net.codejava.models.ProductRevenue;
import net.codejava.services.OrderDetailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class OrderDetailController {
	@Autowired
	private OrderDetailService service;
		
	@GetMapping("/orderDetails")
	public List<OrderDetail> list() {
		return service.listAll();
	}
	
	@PostMapping("/orderDetailByListOrder")
	public List<ProductRevenue> getListODByOId(@RequestBody List<Integer> orderIds) {
		return service.getOrderDetailByListOrderId(orderIds);
	}
	@PostMapping("/orderDetail")
	public void add(@RequestBody OrderDetail orderDetail) {
		service.save(orderDetail);
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
