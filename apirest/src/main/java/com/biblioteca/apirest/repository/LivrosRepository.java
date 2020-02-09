package com.biblioteca.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.biblioteca.apirest.models.Livros;

public interface LivrosRepository extends JpaRepository<Livros,Long>{

	Livros findById(long id);
	
}
