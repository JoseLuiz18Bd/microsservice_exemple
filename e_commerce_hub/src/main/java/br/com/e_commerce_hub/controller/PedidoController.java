package br.com.e_commerce_hub.controller;

import br.com.e_commerce_hub.model.Pedido;

import br.com.e_commerce_hub.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoService pedidoService = new PedidoService();

    @GetMapping()
    public ResponseEntity<List<Pedido>> getListarTodosFromClienteApi() {  return ResponseEntity.ok(pedidoService.listarTodos()); };

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getProcurarPorIdFromClienteApi(@PathVariable Long id) {  return ResponseEntity.ok(pedidoService.procurarPorId(id)); };

    @PostMapping
    public ResponseEntity<Pedido> setCriarPedidoFromClienteApi(@RequestBody Pedido pedido){ return ResponseEntity.ok(pedidoService.criarPedido(pedido));}

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> setAtualizarPedidoFromClienteApi(@RequestBody Pedido pedido){ return ResponseEntity.ok(pedidoService.atualizarPedido(pedido));}

    
}