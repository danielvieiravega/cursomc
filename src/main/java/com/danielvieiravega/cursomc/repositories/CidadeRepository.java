package com.danielvieiravega.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danielvieiravega.cursomc.domain.Cidade;

@Repository 
public interface CidadeRepository extends JpaRepository<Cidade, Integer> { //integer pq o id é int

}
