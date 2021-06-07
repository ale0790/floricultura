package com.floricultura.loja.controller;

import com.floricultura.loja.dto.CompraDTO;
import com.floricultura.loja.model.Compra;
import com.floricultura.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {


    @Autowired
    private CompraService compraService;

    @PostMapping
    public Compra realizaCompra(@RequestBody CompraDTO compra){
        return compraService.realizaCompra(compra);
    }


}
