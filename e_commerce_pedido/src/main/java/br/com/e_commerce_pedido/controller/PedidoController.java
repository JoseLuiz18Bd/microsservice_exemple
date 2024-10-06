package br.com.e_commerce_pedido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.e_commerce_pedido.model.Pedido;
import br.com.e_commerce_pedido.service.PedidoServices;

@RestController
@RequestMapping({"/pedido"})
public class PedidoController {
	
	@Autowired
    private PedidoServices service;

    public PedidoController() {
    }

    @GetMapping(
        produces = {"application/json"}
    )
    public List<Pedido> listarTodos() {
        return this.service.findAll();
    }

    @GetMapping(
        value = {"/{id}"},
        produces = {"application/json"}
    )
    public Pedido encontrarPorId(@PathVariable("id") Long id) {
        return this.service.encontrarPorId(id);
    }

    @PostMapping(
        produces = {"application/json"},
        consumes = {"application/json"}
    )
    public Pedido criarProduto(@RequestBody Pedido pedido) {
        return this.service.criarPedido(pedido);
    }

    @PutMapping(
        value = {"/{id}"},
        produces = {"application/json"},
        consumes = {"application/json"}
    )
    public Pedido atualizarProduto(@RequestBody Pedido pedido) {
        return this.service.atualizarPedido(pedido);
    }

}
