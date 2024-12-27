package com.pauloadam.produtosapi.controler;

import com.pauloadam.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // essa classe vai receber requisições rest
@RequestMapping("/produtos") // qual é a url base desse controle

public class ProdutoController {

    @PostMapping //recurso
    public Produto salvar (@RequestBody Produto produto){
        System.out.println("Produto recebido: "+ produto);
        return produto;
    }
}
