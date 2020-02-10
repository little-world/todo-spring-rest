package com.littleworld.login.controllers;

import com.littleworld.login.model.Login;
import com.littleworld.login.services.LoginService;
import com.littleworld.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {
  
  @Autowired  private LoginService loginService;

  @PostMapping("/login")
  public Login create(@RequestBody Login login) {
    return null;
  }

  @PutMapping("/login")
  public Login update( @RequestBody Todo todo){
    return null;
  }

  @ResponseStatus(value = HttpStatus.OK)
  @DeleteMapping("/login/{id}")
  public void delete(@PathVariable  int id) {
  }

  @GetMapping("/login")
  public List<Todo> findAll() {
    return null;
  }

  @GetMapping("/login/{id}")
  public Optional<Todo> todoById(@PathVariable  int id) {
    return null;
  }

}

