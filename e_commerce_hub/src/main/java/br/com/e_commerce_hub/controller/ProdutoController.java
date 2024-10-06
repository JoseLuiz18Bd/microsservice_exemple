package br.com.e_commerce_hub.controller;

import br.com.e_commerce_hub.model.Produto;
//import br.com.e_commerce_hub.infrastructure.ProdutoApiClient;
import br.com.e_commerce_hub.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService = new ProdutoService();
    @GetMapping
    public ResponseEntity<List<Produto>> findAll() { return ResponseEntity.ok(produtoService.findAll()); }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(Long id) { return ResponseEntity.ok(produtoService.findById(id)); }

    @PostMapping
    public ResponseEntity<Produto> save(@RequestBody Produto produto) { return ResponseEntity.ok(produtoService.save(produto)); }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@RequestBody Produto produto) { return ResponseEntity.ok(produtoService.save(produto)); }
    
    
}