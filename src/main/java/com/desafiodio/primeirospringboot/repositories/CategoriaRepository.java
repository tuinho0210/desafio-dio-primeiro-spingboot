package com.desafiodio.primeirospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.desafiodio.primeirospringboot.entities.Categoria;

@Repository
	public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
