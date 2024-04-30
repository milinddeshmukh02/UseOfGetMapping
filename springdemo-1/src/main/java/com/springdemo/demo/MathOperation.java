package com.springdemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathOperation {

	int num1;
	int num2;

	@PostMapping("input/{num1}/{num2}")
	public String input(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		this.num1 = num1;
		this.num2 = num2;
		sum();
		sub();
		mult();
		div();
		return "code executed succesfully";
	}

	@GetMapping("/sum")
	public int sum() {
		System.out.println(num1 + num2);
		return num1 + num2;
	}

	@GetMapping("sub")
	public int sub() {
		System.out.println(num1 - num2);
		return num1 - num2;

	}

	@GetMapping("mult")
	public void mult() {
		System.out.println(num1 * num2);
	}

	@GetMapping("div")
	public void div() {
		System.out.println(num1 / num2);
	}

}
