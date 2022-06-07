package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.models.Orderr;
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
	public Orderr get(@PathVariable Integer id) {
		return service.get(id);
	}
}
