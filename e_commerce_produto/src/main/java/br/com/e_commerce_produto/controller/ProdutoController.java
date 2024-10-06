package br.com.e_commerce_produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.e_commerce_produto.model.Produto;
import br.com.e_commerce_produto.service.ProdutoServices;

@RestController
@RequestMapping({"/produto"})
public class ProdutoController {
    @Autowired
    private ProdutoServices service;

    public ProdutoController() {
    }

    @GetMapping(
        produces = {"application/json"}
    )
    public List<Produto> listarTodos() {
        return this.service.findAll();
    }

    @GetMapping(
        value = {"/{id}"},
        produces = {"application/json"}
    )
    public Produto encontrarPorId(@PathVariable("id") Long id) {
        return this.service.encontrarPorId(id);
    }

    @PostMapping(
        produces = {"application/json"},
        consumes = {"application/json"}
    )
    public Produto criarProduto(@RequestBody Produto produto) {
        return this.service.criarProduto(produto);
    }

    @PutMapping(
        value = {"/{id}"},
        produces = {"application/json"},
        consumes = {"application/json"}
    )
    public Produto atualizarProduto(@RequestBody Produto produto) {
        return this.service.atualizarProduto(produto);
    }
}
