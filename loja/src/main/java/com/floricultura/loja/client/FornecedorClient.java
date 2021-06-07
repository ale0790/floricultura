package com.floricultura.loja.client;

import com.floricultura.loja.dto.InfoFornecedorDTO;
import com.floricultura.loja.dto.InfoPedidoDTO;
import com.floricultura.loja.dto.ItemCompraDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("fornecedor")
public interface FornecedorClient {

    @RequestMapping("/info/{estado}")
    InfoFornecedorDTO getInfoFornecedor(@PathVariable String estado);

    @RequestMapping(method = RequestMethod.POST, value = "/pedido")
    InfoPedidoDTO realizaPedido(List<ItemCompraDTO> itens);


}
