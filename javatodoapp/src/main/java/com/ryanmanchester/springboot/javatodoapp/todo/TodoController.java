package com.ryanmanchester.springboot.javatodoapp.todo;


import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private TodoService todoService;
	private TodoRepository todoRepository;
	
	private String getUserName(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	
	public TodoController(TodoService todoService, TodoRepository todoRepository) {
		this.todoService = todoService;
		this.todoRepository = todoRepository;
	}
	
	@RequestMapping("list-todos")
	public String getTodos(ModelMap model) {
		String username = getUserName(model);
		List<Todo> todos = todoRepository.findByUsername(username);
		
		model.addAttribute("todos", todos);
		return "listTodos";
	}

	
	@RequestMapping(value="add-todo", method=RequestMethod.GET)
	public String showTodoPage(ModelMap model) {
		String username = getUserName(model);
		Todo todo = new Todo(0, username, "", LocalDate.now(), false);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.POST)
	public String addNewTodo(ModelMap model,@Valid Todo todo, BindingResult result ) {
		if(result.hasErrors()) {
			return "todo";
		}
		String username = getUserName(model);
		todo.setUsername(username);
		todoRepository.save(todo);
		//todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:list-todos";
	}
	
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoRepository.deleteById(id);
		todoService.deleteTodo(id);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="update-todo", method=RequestMethod.GET)
	public String showUpdateTodo(@RequestParam int id, ModelMap model) {
		Todo todo = todoService.findById(id);
		model.addAttribute("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value="update-todo", method=RequestMethod.POST)
	public String updateTodo(ModelMap model,@Valid Todo todo, BindingResult result ) {
		if(result.hasErrors()) {
			return "todo";
		}
		String username = (String)model.get("name");
		todo.setUsername(username);
		todoService.updateTodo(todo);
		return "redirect:list-todos";
	}

}
