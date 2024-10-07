package com.unipac.example.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoDTO {

    private Long id;
    private String descricao;
    private String cod_barras;
    private BigDecimal peso;
    private BigDecimal volume;
    private BigDecimal valor;

}
