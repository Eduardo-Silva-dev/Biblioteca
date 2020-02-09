package com.biblioteca.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.biblioteca.apirest.models.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>{
	
	Clientes findById(long id);
}
