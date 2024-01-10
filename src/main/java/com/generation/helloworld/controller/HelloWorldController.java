package com.generation.helloworld.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloworld() {
		return "Hello World!!";
	}

	@GetMapping("/bsm")
	public String[] bsm() {
		String bsm[] = { "Comunicação", "Proatividade", "Orientação ao detalhe", "Trabalho em equipe",
				"Mentalidade de crescimento", "Orientação ao futuro", "Responsabilidade pessoal", "Persistência" };
		return bsm;
	}

	@GetMapping("/objetivos")
	public ArrayList objetivos() {
		ArrayList<String> objetivos = new ArrayList<String> ();
		
		objetivos.add("Rever conceito de Collections");
		objetivos.add("Fazer exercícios sobre Collections");
		objetivos.add("Ter mentoria de carreira com Pri");
		objetivos.add("Concluir lições e ficar em dia com entregas");
	
		return objetivos;
	}

}
