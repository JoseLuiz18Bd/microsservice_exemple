package br.com.e_commerce_hub.controller;

import br.com.e_commerce_hub.model.Cliente;
import br.com.e_commerce_hub.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
    private final ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> getListarTodosFromClienteApi() {  return ResponseEntity.ok(clienteService.listarTodos()); };

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getProcurarPorIdFromClienteApi(@PathVariable Long id) {  return ResponseEntity.ok(clienteService.procurarPorId(id)); };

    @PostMapping
    public ResponseEntity<Cliente> setCriarClienteFromClienteApi(@RequestBody Cliente cliente){ return ResponseEntity.ok(clienteService.criarCliente(cliente));}

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> setAtualizarClienteFromClienteApi(@RequestBody Cliente cliente){ return ResponseEntity.ok(clienteService.atualizarCliente(cliente));}

	public ClienteController(ClienteService clienteService) {
		super();
		this.clienteService = clienteService;
	}
    
    
}
