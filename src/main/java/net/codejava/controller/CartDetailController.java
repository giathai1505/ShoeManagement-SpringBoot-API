package net.codejava.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.models.CartDetail;
import net.codejava.models.OrderDetail;
import net.codejava.models.Product;
import net.codejava.services.CartDetailService;
import net.codejava.services.OrderDetailService;

@RestController
public class CartDetailController {
	@Autowired
	private CartDetailService service;
		
	@GetMapping("/cartDetails")
	public List<CartDetail> list() {
		return service.listAll();
	}
	
//	@GetMapping("/orderDetails/order/{orderId}")
//	public List<OrderDetail> listOrderDetailByOrder(@PathVariable Integer orderId) {
//		return service.getOrderDetailByOrderId(orderId);
//	}
	@PostMapping("/cartDetail")
	public void add(@RequestBody CartDetail cartDetail) {
		service.save(cartDetail);
	}
	@PutMapping("/cartDetail/{id}")
	public ResponseEntity<?> update(@RequestBody CartDetail cartDetail, @PathVariable Integer id) {
		try {
			CartDetail existCartDetail = service.get(id);
			service.save(existCartDetail);
			return new ResponseEntity<CartDetail>(HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<CartDetail>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/cartDetail/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		try {
			CartDetail existCartDetail = service.get(id);
			service.delete(id);
			return new ResponseEntity<CartDetail>(HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<CartDetail>(HttpStatus.NOT_FOUND);
		}
	}
}
