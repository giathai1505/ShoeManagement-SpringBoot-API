package net.codejava.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.models.Orderr;
import net.codejava.models.Product;
import net.codejava.services.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;
	
	@GetMapping("/orders")
	public List<Orderr> list() {
		return service.listAll();
	}
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<Orderr> get(@PathVariable Integer id) {
		try {
			Orderr orderr = service.get(id);
			return new ResponseEntity<Orderr>(orderr, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Orderr>(HttpStatus.NOT_FOUND);
		}

	}
	@GetMapping("/orders/accountId/{id}")
	public List<Orderr> getByAccountId(@PathVariable Integer id) {
			return service.listAllOrderByAccountId(id);

	}
	@PostMapping("/order")
	public Orderr add(@RequestBody Orderr order) {
		Orderr newOrder = service.save(order); 
		return newOrder;
	}
	@PutMapping("/orders/updateStatus/{id}")
	public ResponseEntity<?> update(@RequestBody Orderr orderr, @PathVariable Integer id) {
		try {
			Orderr existOrderr = service.get(id);
			service.save(orderr);
			return new ResponseEntity<Orderr>(HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Orderr>(HttpStatus.NOT_FOUND);
		}
	}
	
}
