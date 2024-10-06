package br.com.e_commerce_hub.infrastructure;

//import br.com.e_commerce_hub.model.Cliente;
import br.com.e_commerce_hub.model.Pedido;
//import br.com.e_commerce_hub.model.Produto;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "PedidoApiClient", url = "http://localhost:8082/pedido")
public interface PedidoApiClient {

    @GetMapping("/pedido")
    List<Pedido> listarTodos();

    @GetMapping("/{id}")
    Pedido procurarPorId(@PathVariable Long id);

    @PostMapping
    Pedido criarPedido(@RequestBody Pedido pedido);

    @PutMapping("/{id}")
    Pedido atualizarPedido(@RequestBody Pedido pedido);
}
