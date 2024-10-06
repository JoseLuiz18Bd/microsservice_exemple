package br.com.e_commerce_hub.infrastructure;

import br.com.e_commerce_hub.model.Cliente;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "ClienteApiClient", url = "http://localhost:8083/cliente")
public interface ClienteApiClient {

    @GetMapping("/cliente")
    List<Cliente> listarTodos();

    @GetMapping("/{id}")
    Cliente procurarPorId(@PathVariable Long id);

    @PostMapping
    Cliente criarCliente(@RequestBody Cliente cliente);

    @PutMapping("/{id}")
    Cliente atualizarCliente(@RequestBody Cliente cliente);
}
