package br.com.e_commerce_hub.infrastructure;


import br.com.e_commerce_hub.model.Produto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "ProdutoApiClient", url = "http://localhost:8081/produto")
public interface ProdutoApiClient {

    @GetMapping("produto")
    List<Produto> findAll();

    @PostMapping()
    Produto create(Produto produto);

    @GetMapping("/{id}")
    Produto findById(@PathVariable Long id);

    @PutMapping("/{id}")
    Produto update(Produto produto);
}
