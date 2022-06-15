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
import net.codejava.models.Account;
import net.codejava.models.LoginForm;
import net.codejava.models.Product;
import net.codejava.services.AccountService;

@RestController
public class AccountController {
	
	@Autowired AccountService service;
	
	@GetMapping("/account")
	public List<Account> allAccounts()
	{
		return service.getAllAccounts();
	}
	
	@GetMapping("/account/{id}")
	public ResponseEntity<Account> get(@PathVariable Integer id) {
		try {
			Account c = service.getAccountById(id);
			return new ResponseEntity<Account>(c, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/account/login")
	public ResponseEntity<?> login(@RequestBody LoginForm login ) {
		try {
			Account c = service.login(login);
			return new ResponseEntity<Account>(c, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/account")
	public ResponseEntity<?> add(@RequestBody Account account) {
		Account c = service.save(account);
		return new ResponseEntity<Account>(c, HttpStatus.OK);
	}

}
