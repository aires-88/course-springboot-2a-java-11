package com.educandoweb.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

//avisa que é um recurso web
@RestController 
@RequestMapping(value = "/users")
public class UserResource {
	
	//recurso que retorna resposta web
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "aiko@yahoo", "9999", "1234");
		return ResponseEntity.ok().body(u);
	}
}
