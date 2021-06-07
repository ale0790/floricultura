package com.floricultura.loja.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compra {

    private Long pedidoId;
    private Integer tempoPreparo;
    private String enderecoDestino;

}
