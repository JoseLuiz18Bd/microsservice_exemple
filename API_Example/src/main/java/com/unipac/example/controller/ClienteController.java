package com.unipac.example.controller;

import com.unipac.example.dto.ClienteDTO;
import com.unipac.example.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<ClienteDTO>> getListarTodosFromClienteApi() {  return ResponseEntity.ok(clienteService.listarTodos()); };

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> getProcurarPorIdFromClienteApi(@PathVariable Long id) {  return ResponseEntity.ok(clienteService.procurarPorId(id)); };

    @PostMapping
    public ResponseEntity<ClienteDTO> setCriarClienteFromClienteApi(@RequestBody ClienteDTO cliente){ return ResponseEntity.ok(clienteService.criarCliente(cliente));}

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> setAtualizarClienteFromClienteApi(@RequestBody ClienteDTO cliente){ return ResponseEntity.ok(clienteService.atualizarCliente(cliente));}
}
