package com.ryanmanchester.springboot.javatodoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 0;
	
	static {
		todos.add(new Todo(++todoCount, "Ryan", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "Ryan", "Learn Spring Boot", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCount, "Ryan", "Learn MySQL", LocalDate.now().plusMonths(6), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos.stream().filter(todo -> todo.getUsername().equals(username)).toList();
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todoCount, username, description, targetDate, done);
		todos.add(todo);
		
	}
	
	public Todo findById(int id) {
		return todos.stream().filter(todo -> todo.getId() == id).findFirst().get();
	}
	
	public void updateTodo(@Valid Todo todo) {
		deleteTodo(todo.getId());
		todos.add(todo);
	}
	
	public void deleteTodo(int id) {
		todos.removeIf(todo -> todo.getId() == id);
	}

}
