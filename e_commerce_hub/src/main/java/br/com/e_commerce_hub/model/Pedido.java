package br.com.e_commerce_hub.model;

import java.math.BigDecimal;
import java.util.Date;


public class Pedido {
    private Long id;
    private Date dataCriacao;
    private  Long IdCliente;
    private BigDecimal valor;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Long getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(Long idCliente) {
		IdCliente = idCliente;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
    
    
}
