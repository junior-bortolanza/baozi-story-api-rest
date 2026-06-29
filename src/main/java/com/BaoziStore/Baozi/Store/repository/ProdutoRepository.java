package com.BaoziStore.Baozi.Store.repository;

import com.BaoziStore.Baozi.Store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
