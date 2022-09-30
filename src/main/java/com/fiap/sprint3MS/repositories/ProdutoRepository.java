package com.fiap.sprint3MS.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiap.sprint3MS.models.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
	@Query("select * from tb_produto where id = ?1")
	Optional<Produto> getById(long idProduto);
}
