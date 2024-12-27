package com.pauloadam.produtosapi.repository;

import com.pauloadam.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, String>{
}
