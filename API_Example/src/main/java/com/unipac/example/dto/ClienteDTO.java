package com.unipac.example.dto;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
}
