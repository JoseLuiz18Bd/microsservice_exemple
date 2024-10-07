package com.unipac.example.controller;

import com.unipac.example.dto.ProdutoDTO;
import com.unipac.example.infrastructure.ProdutoApiClient;
import com.unipac.example.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;
    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll() { return ResponseEntity.ok(produtoService.findAll()); }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> findById(Long id) { return ResponseEntity.ok(produtoService.findById(id)); }

    @PostMapping
    public ResponseEntity<ProdutoDTO> save(@RequestBody ProdutoDTO produto) { return ResponseEntity.ok(produtoService.save(produto)); }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoDTO> update(@RequestBody ProdutoDTO produto) { return ResponseEntity.ok(produtoService.save(produto)); }
}
