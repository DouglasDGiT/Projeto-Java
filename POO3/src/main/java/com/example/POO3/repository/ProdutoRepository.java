package com.example.POO3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.POO3.model.Produto;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoriaId(Long categoriaId);
}
