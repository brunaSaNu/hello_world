package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class demoController {
	
	@GetMapping
	public String helloworld() {
		return "Hello world!";
	
	}
	
	@GetMapping
	public String bsm() {
		return "Mentalidade de crescimento/ Orientação aos detalhes/ proatividade/ persistência/ comunicação/ trabalho em equipe/";
	}
	
	@GetMapping
	public String aprendizado () {
		return "Aprender Spring do zero e poder aplicar estes conhecimentos";
	}
}