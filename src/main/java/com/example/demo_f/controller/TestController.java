package com.example.demo_f.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.TodoService;
@RestController
@RequestMapping("todo")
public class TestController {

	@Autowired
	private TodoService service;
	@GetMapping("/test")
	public ResponseEntity<?>testTodo() {
		String str=service.testService();
		List<String> list=new ArrayList<>();
		list.add(str);
		ResponseDTO<String> response=ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
	}
//	@GetMapping
//	public String testController() {
//		return "Hello World!(안녕하세요!)";
//	}
//	@GetMapping("/testRequestBody")
//	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
//		return "Hello World! ID"+testRequestBodyDTO.getId()+"Message :" +testRequestBodyDTO.getMessage();
//	}
//	@GetMapping("/testResponseBody") 
//	public ResponseDTO<String>testControllerResponseBody() {
//		List<String> list =new ArrayList<String>();
//		list.add("Hello World! I'm ResponseDTO");
//		list.add("See you!");
//		ResponseDTO<String> response=ResponseDTO.<String>builder().data(list).build();
//		return response;
//	}
//	@GetMapping("/testResponseEntityOk") 
//	public ResponseDTO<String>testControllerResponseEntityOk() {
//		List<String> list =new ArrayList<String>();
//		list.add("Hello World! I'm ResponseEntity. And you get 200!");
//		list.add("See you!");
//		ResponseDTO<String> response=ResponseDTO.<String>builder().data(list).build();
//		return response;
//	}
//	@GetMapping("/testResponseEntityBad") 
//	public ResponseDTO<String>testControllerResponseEntityBad() {
//		List<String> list =new ArrayList<String>();
//		list.add("Hello World! I'm ResponseEntity. And you get 400!");
//		list.add("See you!");
//		ResponseDTO<String> response=ResponseDTO.<String>builder().data(list).build();
//		return response;
//	}
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
