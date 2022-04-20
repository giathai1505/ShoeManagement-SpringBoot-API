package net.codejava.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test2Controller {
	
	@GetMapping("/b")
	public String show()
	{
		return "Ngô Gia Thái";
	}

}
