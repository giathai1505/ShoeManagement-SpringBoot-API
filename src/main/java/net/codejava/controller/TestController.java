package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.models.Test;
import net.codejava.services.TestService;

@RestController
public class TestController {
	@Autowired
	private TestService service;
	
	@GetMapping("/a")
	public List<Test> show()
	{
		return service.getAll();
	}

}
