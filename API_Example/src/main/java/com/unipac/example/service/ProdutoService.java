package com.unipac.example.service;

import com.unipac.example.dto.ProdutoDTO;
import com.unipac.example.infrastructure.ProdutoApiClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoApiClient produtoApiClient;

    public List<ProdutoDTO> findAll() {
        return produtoApiClient.findAll();
    }

    public ProdutoDTO findById(Long id) {
        return produtoApiClient.findById(id);
    }

    public ProdutoDTO save(ProdutoDTO produto) {
        return produtoApiClient.create(produto);
    }

    public ProdutoDTO update(ProdutoDTO produto) {
        return produtoApiClient.update(produto);
    }

}
