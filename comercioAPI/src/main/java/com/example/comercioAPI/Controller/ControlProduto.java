package com.example.comercioAPI.Controller;

import com.example.comercioAPI.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/apiProduto")
public class ControlProduto {

    @Autowired
    ProdutoRepository prRepo;
}
