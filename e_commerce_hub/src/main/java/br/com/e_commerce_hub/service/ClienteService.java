package br.com.e_commerce_hub.service;

import br.com.e_commerce_hub.model.Cliente;
import br.com.e_commerce_hub.infrastructure.ClienteApiClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {

    private final ClienteApiClient clienteApiClient = null;

    public List<Cliente> listarTodos() { return clienteApiClient.listarTodos(); }

    public Cliente procurarPorId(Long id) { return clienteApiClient.procurarPorId(id);}

    public Cliente criarCliente(Cliente cliente){ return clienteApiClient.criarCliente(cliente);}

    public Cliente atualizarCliente(Cliente cliente){ return clienteApiClient.atualizarCliente(cliente);}

    
}