package com.aman.docker.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelLoResource {

	@GetMapping("rest/docker/hello")
	public String hello() {

		return "Hello aman";
		// http://localhost:8080//rest/docker/hello
	}

	@RequestMapping("/")
	public String defaultMethod() {
		return "Hi this is default docker application";
	}

}
