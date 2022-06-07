package net.codejava.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test3 {
	@GetMapping("/c")
	public String show()
	{
		return "Ngô Gia Thái";
	}
}
