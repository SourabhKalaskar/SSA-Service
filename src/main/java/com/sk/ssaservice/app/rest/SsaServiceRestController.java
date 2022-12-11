package com.sk.ssaservice.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sk.ssaservice.app.service.SsaService;

@RestController
public class SsaServiceRestController {

	@Autowired
	private SsaService ssaService;
	
	@GetMapping("/getStateName/{ssnNo}")
	public String getStateName(@PathVariable String ssnNo) {
		
		System.out.println("Inside getStateName method");
		
		return ssaService.getStateName(ssnNo);
	}
}
