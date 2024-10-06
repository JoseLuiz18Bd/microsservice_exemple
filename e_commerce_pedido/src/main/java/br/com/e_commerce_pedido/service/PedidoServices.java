package br.com.e_commerce_pedido.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.e_commerce_pedido.model.Pedido;
import br.com.e_commerce_pedido.repositories.PedidoRepository;

@Service
public class PedidoServices {
	
	@Autowired
	PedidoRepository repository;
   
    public PedidoServices() {
    }

    public Pedido encontrarPorId(Long id) {
    	
        
        return repository.findById(id) .orElseThrow();
    }

    public List<Pedido> findAll() {
    	
        return repository.findAll();
    }

   
    public Pedido criarPedido(Pedido pedido) {
        return repository.save(pedido);
    }

    public Pedido atualizarPedido(Pedido pedido) {
    	
    	var entity = repository.findById(pedido.getId()) .orElseThrow();
    	
    	entity.setDataCriacao(pedido.getDataCriacao());
    	entity.setIdCliente(pedido.getIdCliente());
    	entity.setValor(pedido.getValor());
        
    	return repository.save(entity);    
    }
    
    public void deletarPedido(Long id) {
    	
    	var entity = repository.findById(id) .orElseThrow();
    	
    	repository.delete(entity);
    }

}
