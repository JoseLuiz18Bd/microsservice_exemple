package br.com.e_commerce_hub.model;

import java.math.BigDecimal;


public class Produto {

    private Long id;
    private String descricao;
    private String cod_barras;
    private BigDecimal peso;
    private BigDecimal volume;
    private BigDecimal valor;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCod_barras() {
		return cod_barras;
	}
	public void setCod_barras(String cod_barras) {
		this.cod_barras = cod_barras;
	}
	public BigDecimal getPeso() {
		return peso;
	}
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}
	public BigDecimal getVolume() {
		return volume;
	}
	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
    
    

}
