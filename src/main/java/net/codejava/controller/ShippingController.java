package net.codejava.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.models.Product;
import net.codejava.models.Shipping;
import net.codejava.services.ShippingService;

@RestController
public class ShippingController {
	@Autowired
	private ShippingService service;
	@GetMapping("/shippings")
	public List<Shipping> allShippings()
	{
		return service.getAllShippings();
	}
	@GetMapping("/shippings/accountId/{accountId}")
	public List<Shipping> listShippingByAccount(@PathVariable Integer accountId) {
		return service.getShippingByAcountId(accountId);
	}
	@GetMapping("/shippings/{id}")
	public ResponseEntity<Shipping> get(@PathVariable Integer id) {
		try {
			Shipping shipping = service.get(id);
			return new ResponseEntity<Shipping>(shipping, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Shipping>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/shipping")
	public void add(@RequestBody Shipping shipping) {
		service.save(shipping);
	}
}
