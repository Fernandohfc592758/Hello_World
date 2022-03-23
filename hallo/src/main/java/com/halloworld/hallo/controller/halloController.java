package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class halloController {
	
	@GetMapping
	public String hello() {
		return "Hallo Generation!!!";
	/* Hello World!
	 * BSM: Orientação ao futuro, Responsabilidade Pessoal, mentalidade de crescimento,
	 * persistência, trabalho em equipe, atenção aos detalhes, proatividade e comunicação.
	 * Meus Objetivos para a semana:   Aprender Spring boot com Java.*/
	}

}
