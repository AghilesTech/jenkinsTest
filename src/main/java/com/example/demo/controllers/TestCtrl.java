/**
 * 
 */
package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AgLounes
 *
 */
@RestController
@RequestMapping("test")
public class TestCtrl {

	@Value("${environnement.value}")
	private String valueEnvTest;
	
	@GetMapping("/")
	public String test() {
		return valueEnvTest;
	}
}
