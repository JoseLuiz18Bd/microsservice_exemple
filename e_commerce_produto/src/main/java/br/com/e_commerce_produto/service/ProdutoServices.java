package br.com.e_commerce_produto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.e_commerce_produto.model.Produto;
import br.com.e_commerce_produto.repositories.ProdutoRepository;

@Service
public class ProdutoServices {

    
    @Autowired
    ProdutoRepository repository;
   
    public ProdutoServices() {
    }

    public Produto encontrarPorId(Long id) {
    	
        
        return repository.findById(id) .orElseThrow();
    }

    public List<Produto> findAll() {
    	
        return repository.findAll();
    }

   
    public Produto criarProduto(Produto produto) {
        return repository.save(produto);
    }

    public Produto atualizarProduto(Produto produto) {
    	
    	var entity = repository.findById(produto.getId()) .orElseThrow();
    	
    	entity.setDescricao(produto.getDescricao());
    	entity.setCodBarras(produto.getCodBarras());
    	entity.setPeso(produto.getPeso());
    	entity.setVolume(produto.getVolume());
    	entity.setValor(produto.getValor());
        
    	return repository.save(entity);    
    }
    
    public void deletarProduto(Long id) {
    	
    	var entity = repository.findById(id) .orElseThrow();
    	
    	repository.delete(entity);
    }
}
