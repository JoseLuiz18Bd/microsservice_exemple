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

import br.com.e_commerce_pedido.model.ItemPedido;
import br.com.e_commerce_pedido.service.ItemPedidoServices;

@RestController
@RequestMapping({"/itemPedido"})
public class ItemPedidoController {
	
	@Autowired
    private ItemPedidoServices serviceItem;

    public ItemPedidoController() {
    }

    @GetMapping(
        produces = {"application/json"}
    )
    public List<ItemPedido> listarTodos() {
        return this.serviceItem.findAll();
    }

    @GetMapping(
        value = {"/{id}"},
        produces = {"application/json"}
    )
    public ItemPedido encontrarPorId(@PathVariable("id") Long id) {
        return this.serviceItem.encontrarPorId(id);
    }

    @PostMapping(
        produces = {"application/json"},
        consumes = {"application/json"}
    )
    public ItemPedido criarItem(@RequestBody ItemPedido item) {
        return this.serviceItem.criarItem(item);
    }

    @PutMapping(
        value = {"/{id}"},
        produces = {"application/json"},
        consumes = {"application/json"}
    )
    public ItemPedido atualizarItem(@RequestBody ItemPedido item) {
        return this.serviceItem.atualizarItem(item);
    }


}
