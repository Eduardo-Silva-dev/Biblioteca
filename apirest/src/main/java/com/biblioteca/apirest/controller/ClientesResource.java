package com.biblioteca.apirest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biblioteca.apirest.models.Clientes;
import com.biblioteca.apirest.repository.ClientesRepository;

@RestController
@RequestMapping(value="/clientes")
public class ClientesResource {

	@Autowired
	private ClientesRepository clientesrepository;
	
	@GetMapping
	public List<Clientes> listartodos(){
		return clientesrepository.findAll();
	}
	
	@GetMapping("{id}")
	public Clientes listar(@PathVariable(value="id")long id) {
		return clientesrepository.findById(id);
	}
	
	@PostMapping
	public Clientes salvarLivro (@RequestBody Clientes cliente) {
		return clientesrepository.save(cliente);
	}
	
	@DeleteMapping
	public void deletarLivro (@RequestBody Clientes cliente) {
		clientesrepository.delete(cliente);
	}
	
	@PutMapping
	public Clientes atualizaLivros (@RequestBody Clientes cliente) {
		return clientesrepository.save(cliente);
	}
}
