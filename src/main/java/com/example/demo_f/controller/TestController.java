package com.example.demo_f.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.TestRequestBodyDTO;
@RestController
@RequestMapping("test")
public class TestController {

	@GetMapping
	public String testController() {
		return "Hello World!(안녕하세요!)";
	}
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
		return "Hello World! ID"+testRequestBodyDTO.getId()+"Message :" +testRequestBodyDTO.getMessage();
	}
//	@GetMapping("/{id}")
//	public String testControlllerWithPathVariables(@PathVariable(required=false) int id) {
//		return "Hello World! ID "+ id;
//	}
//	
//	@GetMapping("/Param")
//	public String testControllerRequestParam(@RequestParam(required=false) int id) {
//		return "Hello World! ID param " +id;
//	}
}
