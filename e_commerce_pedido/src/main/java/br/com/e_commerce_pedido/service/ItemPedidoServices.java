package br.com.e_commerce_pedido.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.e_commerce_pedido.model.ItemPedido;
import br.com.e_commerce_pedido.repositories.ItemPedidoRepository;

@Service
public class ItemPedidoServices {
	
	@Autowired
	ItemPedidoRepository repository;
   
    public ItemPedidoServices() {
    }

    public ItemPedido encontrarPorId(Long id) {
    	
        
        return repository.findById(id) .orElseThrow();
    }

    public List<ItemPedido> findAll() {
    	
        return repository.findAll();
    }

   
    public ItemPedido criarItem(ItemPedido item) {
        return repository.save(item);
    }

    public ItemPedido atualizarItem(ItemPedido item) {
    	
    	var entity = repository.findById(item.getId()) .orElseThrow();
    	
    	entity.setIdPedido(item.getIdPedido());
    	entity.setIdProduto(item.getIdProduto());
    	entity.setQuantidade(item.getQuantidade());
    	entity.setValor(item.getValor());
        
    	return repository.save(entity);    
    }
    
    public void deletarItem(Long id) {
    	
    	var entity = repository.findById(id) .orElseThrow();
    	
    	repository.delete(entity);
    }

}
