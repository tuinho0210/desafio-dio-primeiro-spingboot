package com.desafiodio.primeirospringboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiodio.primeirospringboot.entities.Produto;
import com.desafiodio.primeirospringboot.repositories.ProdutoRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/produtos")

public class ProdutoResource {
	
		@Autowired
		private ProdutoRepository produtoRepository;
		

		@GetMapping
		public ResponseEntity<List <Produto>> findAll() {
			List<Produto> list = produtoRepository.findAll();
			return ResponseEntity.ok().body(list);
		}
		@GetMapping(value = "/{id}")
		public ResponseEntity<Produto> findById(@PathVariable Long id) {
			Produto obj = produtoRepository.findById(id).get();
			return ResponseEntity.ok().body(obj);
		}
			@DeleteMapping("/{id}")
			public ResponseEntity<Void> delete(@PathVariable Long id){
			produtoRepository.deleteById(id);
			return ResponseEntity.ok().build();
			}
			
			@PostMapping
			public ResponseEntity <Produto> post(@RequestBody Produto produto){
				produtoRepository.save(produto);
				return ResponseEntity.ok(produto);
			}
			
}
