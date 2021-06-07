package com.example.aws_test_pipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public  @ResponseBody String helloWorld() {
	    return "Hello World!";
	}  
}