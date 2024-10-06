package br.com.e_commerce_cliente.controller;

import br.com.e_commerce_cliente.model.Cliente;
import br.com.e_commerce_cliente.service.ClienteServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/cliente"})
public class ClienteController {
    @Autowired
    private ClienteServices service;

    public ClienteController() {
    }

    @GetMapping(
        produces = {"application/json"}
    )
    public List<Cliente> listarTodos() {
        return this.service.findAll();
    }

    @GetMapping(
        value = {"/{id}"},
        produces = {"application/json"}
    )
    public Cliente encontrarPorId(@PathVariable("id") Long id) {
        return this.service.encontrarPorId(id);
    }

    @PostMapping(
        produces = {"application/json"},
        consumes = {"application/json"}
    )
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return this.service.criarCliente(cliente);
    }

    @PutMapping(
        value = {"/{id}"},
        produces = {"application/json"},
        consumes = {"application/json"}
    )
    public Cliente atualizarCliente(@RequestBody Cliente cliente) {
        return this.service.atualizarCliente(cliente);
    }
}
