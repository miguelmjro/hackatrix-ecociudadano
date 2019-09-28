package com.co.latin.ecociudadano.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class EcocidadanoWS {
	
	@GetMapping
	public String ping() {
		return "OK";
	}

}
