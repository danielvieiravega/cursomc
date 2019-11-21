package com.danielvieiravega.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danielvieiravega.cursomc.domain.Estado;

@Repository 
public interface EstadoRepository extends JpaRepository<Estado, Integer> { //integer pq o id é int

}
