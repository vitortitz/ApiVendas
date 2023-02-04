package io.github.vendas.domain.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.vendas.domain.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
