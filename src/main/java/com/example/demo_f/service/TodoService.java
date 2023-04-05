package com.example.demo_f.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.demo_f.model.TodoEntity;
import com.example.demo_f.persistence.TodoRepository;


@Service
public class TodoService {
	@Autowired
	private TodoRepository repository;
public String testService() {
	TodoEntity entity=TodoEntity.builder().userId("user01").title("My first todo item").build();
	repository.save(entity);
	TodoEntity savedEntity=repository.findByUserId(entity.getUserId()).get(0);
	
	return savedEntity.getUserId();
}
}
