package com.danielvieiravega.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danielvieiravega.cursomc.domain.Categoria;

@Repository 
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> { //integer pq o id é int

}
