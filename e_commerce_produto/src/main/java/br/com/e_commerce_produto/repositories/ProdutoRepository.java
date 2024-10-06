package br.com.e_commerce_produto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.e_commerce_produto.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
