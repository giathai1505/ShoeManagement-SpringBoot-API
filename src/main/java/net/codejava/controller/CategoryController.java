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

import net.codejava.models.Category;
import net.codejava.services.CategoyService;


@RestController
public class CategoryController {
	@Autowired
	private CategoyService service;
	@GetMapping("/category")
	public List<Category> allCategorys()
	{
		return service.getAllCategorys();
	}
	
	
	@GetMapping("/category/{id}")
	public ResponseEntity<Category> get(@PathVariable Integer id) {
		try {
			Category c = service.getCategoryById(id);
			return new ResponseEntity<Category>(c, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PostMapping("/category")
	public void add(@RequestBody Category c) {
		service.saveCategory(c);
	}
	
	
	@PutMapping("/category/{id}")
	public ResponseEntity<?> update(@RequestBody Category c, @PathVariable Integer id) {
		try {
			Category existCategory = service.getCategoryById(id);
			service.saveCategory(c);
			return new ResponseEntity<Category>(HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/category/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		try {
			Category existProduct = service.getCategoryById(id);
			service.deleteCategory(id);
			return new ResponseEntity<Category>(HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
		}
	}

}
