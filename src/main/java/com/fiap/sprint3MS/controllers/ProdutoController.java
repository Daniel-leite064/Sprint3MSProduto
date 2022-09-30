package com.fiap.sprint3MS.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.sprint3MS.models.Produto;
import com.fiap.sprint3MS.repositories.ProdutoRepository;


@RestController
@RequestMapping("/v1")
public class ProdutoController {
		
	@Autowired
	private ProdutoRepository produtoRepository;

	
	@GetMapping("/produto")
	public ResponseEntity<Produto> getAll()
	{
		List<Produto> produto = produtoRepository.findAll();
		return new ResponseEntity(produto.toArray(), HttpStatus.OK);
	}
	
	
	@GetMapping("/produto/{idProduto}")
	public ResponseEntity<Produto> getById(@PathVariable long idProduto)
	{
		Optional<Produto> produto = produtoRepository.findById(idProduto);
		return new ResponseEntity<Produto>(produto.get(), HttpStatus.OK);
	}
	
	@PostMapping("/produto")
	public ResponseEntity<Produto> save(@RequestBody Produto produto)
	{
		Optional<Produto> produtoExistente = produtoRepository.findById(produto.getIdProduto());
		
		if(produtoExistente.isPresent()) {
			return new ResponseEntity("Produto já existente!",HttpStatus.BAD_REQUEST);
		}
		
		produtoRepository.save(produto);
		return new ResponseEntity<Produto>(produto, HttpStatus.CREATED);
	}
	
	@PutMapping("/produto")
	public ResponseEntity<Produto> edit(@PathVariable long idProduto)
	{
		Optional<Produto> produtoExistente = produtoRepository.findById(idProduto);
		
		if(!produtoExistente.isPresent()) {
			return new ResponseEntity("Produto não encontrado!",HttpStatus.BAD_REQUEST);
		}
		
		produtoRepository.save(produtoExistente.get());
		return new ResponseEntity(produtoExistente, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/produto")
	public ResponseEntity<Produto> delete(@RequestBody Produto produto){
		Optional<Produto> produtoExistente = produtoRepository.findById(produto.getIdProduto());
		if(!produtoExistente.isPresent()) {
			return new ResponseEntity("Produto não encontrado!",HttpStatus.BAD_REQUEST);
		}
		
		produtoRepository.delete(produto);
		return new ResponseEntity<Produto>(produto, HttpStatus.OK);
	}

	
	
}
