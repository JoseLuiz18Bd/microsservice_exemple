package com.unipac.example.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PedidoDTO {
    private Long id;
    private Date dataCriacao;
    private  Long IdCliente;
    private BigDecimal valor;
}
