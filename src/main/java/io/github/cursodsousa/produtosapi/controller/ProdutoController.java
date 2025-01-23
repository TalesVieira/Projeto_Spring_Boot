package io.github.cursodsousa.produtosapi.controller;

import io.github.cursodsousa.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //diz ao spring que essa classe vai receber requisições rest
@RequestMapping ("produtos")// vai dizer qual é a url base desse controller
public class ProdutoController {

    @PostMapping //quando vou salvar / criar um recurso no servidor
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);
        return produto;
    }


}
