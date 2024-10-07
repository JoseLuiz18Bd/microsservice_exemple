package com.unipac.example.infrastructure;

import com.unipac.example.dto.ClienteDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "ClienteApiClient", url = "http://localhost:8083/cliente")
public interface ClienteApiClient {

    @GetMapping
    List<ClienteDTO> listarTodos();

    @GetMapping("/{id}")
    ClienteDTO procurarPorId(@PathVariable Long id);

    @PostMapping
    ClienteDTO criarCliente(@RequestBody ClienteDTO cliente);

    @PutMapping("/{id}")
    ClienteDTO atualizarCliente(@RequestBody ClienteDTO cliente);
}
