package com.desafiodio.primeirospringboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desafiodio.primeirospringboot.entities.Categoria;
import com.desafiodio.primeirospringboot.repositories.CategoriaRepository;

@RestController
@RequestMapping(value = "/categorias")

public class CategoriaResource {
	
		@Autowired
		private CategoriaRepository categoriaRepository;

		@GetMapping
		public ResponseEntity<List <Categoria>> findAll() {
			List<Categoria> list = categoriaRepository.findAll();
			return ResponseEntity.ok().body(list);
		}

		@GetMapping(value = "/{id}")
		public ResponseEntity<Categoria> findById(@PathVariable Long id) {
			Categoria obj = categoriaRepository.findById(id).get();
			return ResponseEntity.ok().body(obj);
		}
		
		
}

