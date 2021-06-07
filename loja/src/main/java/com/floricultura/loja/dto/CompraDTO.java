package com.floricultura.loja.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class CompraDTO {
    private List<ItemCompraDTO> itens;
    private EnderecoDTO endereco;
}
