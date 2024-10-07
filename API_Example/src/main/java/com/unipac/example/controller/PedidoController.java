package com.unipac.example.controller;
import com.unipac.example.dto.PedidoDTO;

import com.unipac.example.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    @GetMapping()
    public ResponseEntity<List<PedidoDTO>> getListarTodosFromClienteApi() {  return ResponseEntity.ok(pedidoService.listarTodos()); };

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO> getProcurarPorIdFromClienteApi(@PathVariable Long id) {  return ResponseEntity.ok(pedidoService.procurarPorId(id)); };

    @PostMapping
    public ResponseEntity<PedidoDTO> setCriarPedidoFromClienteApi(@RequestBody PedidoDTO pedido){ return ResponseEntity.ok(pedidoService.criarPedido(pedido));}

    @PutMapping("/{id}")
    public ResponseEntity<PedidoDTO> setAtualizarPedidoFromClienteApi(@RequestBody PedidoDTO pedido){ return ResponseEntity.ok(pedidoService.atualizarPedido(pedido));}

}
