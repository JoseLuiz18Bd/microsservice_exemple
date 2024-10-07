package com.unipac.example.service;

import com.unipac.example.dto.ClienteDTO;
import com.unipac.example.infrastructure.ClienteApiClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {

    private final ClienteApiClient clienteApiClient;

    public List<ClienteDTO> listarTodos() { return clienteApiClient.listarTodos(); }

    public ClienteDTO procurarPorId(Long id) { return clienteApiClient.procurarPorId(id);}

    public ClienteDTO criarCliente(ClienteDTO cliente){ return clienteApiClient.criarCliente(cliente);}

    public ClienteDTO atualizarCliente(ClienteDTO cliente){ return clienteApiClient.atualizarCliente(cliente);}


}
