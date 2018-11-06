package com.blkydpease.serviceone.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServices {
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue="World") String name) {
		return "Hello, " + name;
	}

}
