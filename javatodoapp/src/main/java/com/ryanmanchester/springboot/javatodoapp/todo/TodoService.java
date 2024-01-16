package com.ryanmanchester.springboot.javatodoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1, "Ryan", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "Ryan", "Learn Spring Boot", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "Ryan", "Learn MySQL", LocalDate.now().plusMonths(6), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}

}
