package com.unipac.example.infrastructure;


import com.unipac.example.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "ProdutoApiClient", url = "http://localhost:8081/produto")
public interface ProdutoApiClient {

    @GetMapping()
    List<ProdutoDTO> findAll();

    @PostMapping()
    ProdutoDTO create(ProdutoDTO produto);

    @GetMapping("/{id}")
    ProdutoDTO findById(@PathVariable Long id);

    @PutMapping("/{id}")
    ProdutoDTO update(ProdutoDTO produto);
}
