package br.com.e_commerce_cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.e_commerce_cliente.model.Cliente;
import br.com.e_commerce_cliente.repositories.ClienteRepository;

@Service
public class ClienteServices {

    
    @Autowired
    ClienteRepository repository;
   
    public ClienteServices() {
    }

    public Cliente encontrarPorId(Long id) {
    	
        
        return repository.findById(id) .orElseThrow();
    }

    public List<Cliente> findAll() {
    	
        return repository.findAll();
    }

   
    public Cliente criarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente atualizarCliente(Cliente cliente) {
    	
    	var entity = repository.findById(cliente.getId()) .orElseThrow();
    	
    	entity.setNome(cliente.getNome());
    	entity.setCpf(cliente.getCpf());
    	entity.setEmail(cliente.getEmail());
    	entity.setTelefone(cliente.getTelefone());
        
    	return repository.save(entity);    
    }
    
    public void deletarCliente(Long id) {
    	
    	var entity = repository.findById(id) .orElseThrow();
    	
    	repository.delete(entity);
    }
}
