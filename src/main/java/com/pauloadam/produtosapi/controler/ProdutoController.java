package com.pauloadam.produtosapi.controler;

import com.pauloadam.produtosapi.model.Produto;
import com.pauloadam.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController // essa classe vai receber requisições rest
@RequestMapping("/produtos") // qual é a url base desse controle

public class ProdutoController {

    private ProdutoRepository produtoRepository ;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping //recurso
    public Produto salvar (@RequestBody Produto produto){
        System.out.println("Produto recebido: "+ produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }
}
