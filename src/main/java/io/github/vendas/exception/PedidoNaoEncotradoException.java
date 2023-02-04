package io.github.vendas.exception;

public class PedidoNaoEncotradoException extends RuntimeException {
    public PedidoNaoEncotradoException() {
        super("Pedido não encontrado!");
    }
}
