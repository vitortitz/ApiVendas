package io.github.vendas.domain.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.vendas.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
