package com.littleworld.todo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.littleworld.todo.model.*;
import com.littleworld.todo.services.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoController {
  
  @Autowired  private TodoService todoService;

  @PostMapping("/todo")
  public Todo create(@RequestBody Todo todo) {
    return todoService.save(todo);
  }

  @PutMapping("/todo")
  public Todo update(@RequestBody Todo todo) {
    return todoService.save(todo);
  }

  @ResponseStatus(value = HttpStatus.OK)
  @DeleteMapping("/todo/{id}")
  public void delete(@PathVariable  int id) {
    todoService.deleteById(id);
  }

  @GetMapping("/todo")
  public List<Todo> findAll() {
    return (List<Todo>)todoService.findAll();
  }

  @GetMapping("/todo/{id}")
  public Optional<Todo> todoById(@PathVariable  int id) {
    return todoService.findById(id);
  }
}

