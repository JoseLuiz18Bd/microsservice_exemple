package com.unipac.example.infrastructure;

import com.unipac.example.dto.ClienteDTO;
import com.unipac.example.dto.PedidoDTO;
import com.unipac.example.dto.ProdutoDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "PedidoApiClient", url = "http://localhost:8082/pedido")
public interface PedidoApiClient {

    @GetMapping
    List<PedidoDTO> listarTodos();

    @GetMapping("/{id}")
    PedidoDTO procurarPorId(@PathVariable Long id);

    @PostMapping
    PedidoDTO criarPedido(@RequestBody PedidoDTO pedido);

    @PutMapping("/{id}")
    PedidoDTO atualizarPedido(@RequestBody PedidoDTO pedido);
}
