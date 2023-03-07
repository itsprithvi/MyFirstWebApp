package com.example.MyFirstWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1, "prithvi", "Learn Spring", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(1, "prithvi", "Learn Microservice", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(1, "prithvi", "Learn Kafka", LocalDate.now().plusYears(13), false));
	}
	
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
