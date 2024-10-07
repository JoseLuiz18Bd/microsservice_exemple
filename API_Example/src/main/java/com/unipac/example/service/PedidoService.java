package com.unipac.example.service;


import com.unipac.example.dto.PedidoDTO;
import com.unipac.example.infrastructure.PedidoApiClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PedidoService {

    private final PedidoApiClient pedidoApiClient;

    public List<PedidoDTO> listarTodos() { return pedidoApiClient.listarTodos(); }

    public PedidoDTO procurarPorId(Long id) { return pedidoApiClient.procurarPorId(id);}

    public PedidoDTO criarPedido(PedidoDTO pedido){ return pedidoApiClient.criarPedido(pedido);}

    public PedidoDTO atualizarPedido(PedidoDTO pedido){ return pedidoApiClient.atualizarPedido(pedido);}

}
