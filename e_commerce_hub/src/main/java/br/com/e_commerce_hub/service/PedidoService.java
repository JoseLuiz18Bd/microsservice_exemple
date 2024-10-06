package br.com.e_commerce_hub.service;

import br.com.e_commerce_hub.model.Pedido;
import br.com.e_commerce_hub.infrastructure.PedidoApiClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PedidoService {

    private final PedidoApiClient pedidoApiClient = null;

    public List<Pedido> listarTodos() { return pedidoApiClient.listarTodos(); }

    public Pedido procurarPorId(Long id) { return pedidoApiClient.procurarPorId(id);}

    public Pedido criarPedido(Pedido pedido){ return pedidoApiClient.criarPedido(pedido);}

    public Pedido atualizarPedido(Pedido pedido){ return pedidoApiClient.atualizarPedido(pedido);}

}
