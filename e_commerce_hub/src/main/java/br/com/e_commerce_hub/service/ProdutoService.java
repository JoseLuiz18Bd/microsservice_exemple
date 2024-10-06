package br.com.e_commerce_hub.service;

import br.com.e_commerce_hub.model.Produto;
import br.com.e_commerce_hub.infrastructure.ProdutoApiClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoApiClient produtoApiClient = null;

    public List<Produto> findAll() {
        return produtoApiClient.findAll();
    }

    public Produto findById(Long id) {
        return produtoApiClient.findById(id);
    }

    public Produto save(Produto produto) {
        return produtoApiClient.create(produto);
    }

    public Produto update(Produto produto) {
        return produtoApiClient.update(produto);
    }

}