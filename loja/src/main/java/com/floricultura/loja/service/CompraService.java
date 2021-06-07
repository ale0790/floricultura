package com.floricultura.loja.service;

import com.floricultura.loja.client.FornecedorClient;
import com.floricultura.loja.dto.CompraDTO;
import com.floricultura.loja.dto.InfoFornecedorDTO;
import com.floricultura.loja.dto.InfoPedidoDTO;
import com.floricultura.loja.model.Compra;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);

    @Autowired
    private FornecedorClient fornecedorClient;

    public Compra realizaCompra(CompraDTO compra) {

        final String estado = compra.getEndereco().getEstado();

        LOG.info("Realizando busca das informações do fornecedor do {}",estado);

        InfoFornecedorDTO infoFornecedor = fornecedorClient.getInfoFornecedor(estado);

        LOG.info("Realizando um pedido");

        InfoPedidoDTO infoPedidoDTO = fornecedorClient.realizaPedido(compra.getItens());

        System.out.println(infoFornecedor.getEndereco());

        Compra compraSalva = new Compra();
        compraSalva.setPedidoId(infoPedidoDTO.getId());
        System.out.println("infoPedidoDTO" +infoPedidoDTO.toString());
        compraSalva.setTempoPreparo(infoPedidoDTO.getTempoDePreparo());
        compraSalva.setEnderecoDestino(compra.getEndereco().toString());

        return compraSalva;

    }
}
