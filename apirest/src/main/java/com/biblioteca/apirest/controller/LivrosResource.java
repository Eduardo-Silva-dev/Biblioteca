package com.biblioteca.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.apirest.models.Livros;
import com.biblioteca.apirest.repository.LivrosRepository;

@RestController
@RequestMapping(value="/livros")
public class LivrosResource {

	@Autowired
	private LivrosRepository livrosrepository;
	
	@GetMapping("/listartodos")
	public List<Livros> listartodos(){
		return livrosrepository.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Livros listar(@PathVariable(value="id")long id) {
		return livrosrepository.findById(id);
	}
	
	@PostMapping("/cadastrar")
	public Livros salvarLivro (@RequestBody Livros livro) {
		return livrosrepository.save(livro);
	}
	
	@DeleteMapping("/deletar")
	public void deletaProduto(@RequestBody @Valid Livros livro) {
		livrosrepository.delete(livro);
	}
	
	@PutMapping("/atualizar")
	public Livros atualizaProduto(@RequestBody @Valid Livros livro) {
		return livrosrepository.save(livro);
	}
}
