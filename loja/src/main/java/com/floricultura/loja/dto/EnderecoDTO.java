package com.floricultura.loja.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class EnderecoDTO {
    private String rua;
    private Integer numero;
    private String estado;
}
