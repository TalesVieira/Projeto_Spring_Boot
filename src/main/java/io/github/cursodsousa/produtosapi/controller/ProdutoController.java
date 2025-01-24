package io.github.cursodsousa.produtosapi.controller;

import io.github.cursodsousa.produtosapi.model.Produto;
import io.github.cursodsousa.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController //diz ao spring que essa classe vai receber requisições rest
@RequestMapping ("produtos")// vai dizer qual é a url base desse controller
public class ProdutoController {


    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping //quando vou salvar / criar um recurso no servidor
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);


        produtoRepository.save(produto);
        return produto;
    }
    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable("id") String id){
       // Optional<Produto> produto = produtoRepository.findById(id);
        //return produto.isPresent() ? produto.get() : null;

        //o código de baixo faz a mesma coisa que os dois de cima

        return produtoRepository.findById(id).orElse(null);
    }
    
}
