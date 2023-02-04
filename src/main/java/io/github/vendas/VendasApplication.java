package io.github.vendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendasApplication {
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

	// Pedido p = new Pedido();

	// p.setCliente(vitor);
	// p.setDataPedido(LocalDate.now());
	// p.setTotal(BigDecimal.valueOf(100));

	// pedidos.save(p);
	// pedidos.findByCliente(vitor).forEach(System.out::println);
	// ;
	// // Cliente cliente = clientes.findClienteFetchPedidos(vitor.getId());
	// // System.out.println(cliente);
	// // System.out.println(cliente.getPedidos());
	// // List<Cliente> todosClientes = clientes.findAll();
	// // todosClientes.forEach(System.out::println);

	// // System.out.println("\nAtualizando\n");
	// // todosClientes.forEach(c -> {
	// // c.setNome(c.getNome() + " Atualizei");
	// // clientes.save(c);
	// // });
	// // todosClientes = clientes.encontrarPorNome("Vitor Atualizei");
	// // System.out.println("AQUI VAI ");
	// // todosClientes.forEach(System.out::println);

	// // clientes.findByNomeLike("Vi").forEach(System.out::println);

	// // System.out.println("\nDeletando Clientes");
	// // for (Cliente obterTodos : clientes.findAll()) {
	// // clientes.delete(obterTodos);
	// // }
	// // todosClientes = clientes.findAll();
	// // if (todosClientes.isEmpty()) {
	// // System.out.println("\nNenhum cliente encontrado");
	// // } else {
	// // todosClientes.forEach(System.out::println);
	// // }
	// };

	// }

}
