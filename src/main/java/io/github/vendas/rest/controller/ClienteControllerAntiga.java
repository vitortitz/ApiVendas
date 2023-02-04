// package io.github.vendas.rest.controller;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.data.domain.Example;
// import org.springframework.data.domain.ExampleMatcher;
// import org.springframework.data.domain.ExampleMatcher.StringMatcher;

// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// import org.springframework.web.bind.annotation.ResponseBody;

// import io.github.vendas.domain.entity.Cliente;
// import io.github.vendas.domain.entity.repository.Clientes;

// @Controller

// public class ClienteControllerAntiga {
// // @RequestMapping(value = "/api/clientes/hello/{nome}", method =
// // RequestMethod.GET, consumes = { "application/json",
// // "application/xml" }, produces = { "application/json",
// // "application/xml" })

// private Clientes clientes;

// public ClienteControllerAntiga(Clientes clientes) {
// this.clientes = clientes;
// }

// @GetMapping("/api/clientes/{id}")
// @ResponseBody
// public ResponseEntity getClienteById(@PathVariable Integer id) {
// Optional<Cliente> cliente = clientes.findById(id);

// if (cliente.isPresent()) {
// // ResponseEntity<Cliente> responseEntity = new
// ResponseEntity<>(cliente.get(),
// // HttpStatus.OK);
// return ResponseEntity.ok(cliente.get());
// }

// return ResponseEntity.notFound().build();
// }

// @PostMapping("api/clientes")
// @ResponseBody
// public ResponseEntity save(@RequestBody Cliente cliente) {
// Cliente clienteSalvo = clientes.save(cliente);
// return ResponseEntity.ok(clienteSalvo);
// }

// @PutMapping("/api/clientes/{id}")
// @ResponseBody
// public ResponseEntity update(@PathVariable Integer id, @RequestBody Cliente
// cliente) {
// return clientes.findById(id).map(clienteExistente -> {
// cliente.setId(clienteExistente.getId());
// clientes.save(cliente);
// return ResponseEntity.noContent().build();
// }).orElseGet(() -> ResponseEntity.notFound().build());
// }

// @GetMapping("/api/clientes")
// public ResponseEntity find(Cliente filtro) {
// ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase()
// .withStringMatcher(StringMatcher.CONTAINING);
// Example example = Example.of(filtro, matcher);
// List<Cliente> lista = clientes.findAll(example);
// return ResponseEntity.ok(lista);
// }

// // @DeleteMapping("/api/clientes/{id}")
// // @ResponseBody
// // public ResponseEntity delete(@PathVariable Integer id) {
// // Optional<Cliente> cliente = clientes.findById(id);

// // if (cliente.isPresent()) {
// // // ResponseEntity<Cliente> responseEntity = new
// // ResponseEntity<>(cliente.get(),
// // // HttpStatus.OK);
// // clientes.delete(cliente.get());
// // return ResponseEntity.noContent().build();
// // }

// // return ResponseEntity.notFound().build();
// // }
// }
