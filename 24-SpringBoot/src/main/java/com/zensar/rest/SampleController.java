package com.zensar.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String f1() {
		return "Welcomr to REST";
	}
}
