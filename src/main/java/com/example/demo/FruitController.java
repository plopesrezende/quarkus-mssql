package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno-contato")
public class FruitController {

	@Autowired
	FruitRepository service; 
	
	@GetMapping(value = "/all")
	public List<Fruit> finAlunoContatoEntityAll() {
		return this.service.findTop100000();
	}
	
	@GetMapping(value = "/{id}")
	public Fruit getById(@PathVariable Long id) {
		return this.service.getOne(id);
	}
	
	@PostMapping
	public void post() {
		List<Fruit> findAll = service.findAll();
		for (Fruit alunoContatoEntity : findAll) {
			
		}
	}
}
