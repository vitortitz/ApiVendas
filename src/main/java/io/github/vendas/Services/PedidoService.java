package io.github.vendas.Services;

import java.util.Optional;

import io.github.vendas.domain.entity.Pedido;
import io.github.vendas.domain.enums.StatusPedido;
import io.github.vendas.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);

}
