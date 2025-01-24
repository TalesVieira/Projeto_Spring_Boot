package io.github.cursodsousa.produtosapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//POJO - Plain old java object
@Entity
@Table(name = "produto")//não é obrigatório quando o nome da tabela tem o mesmo nome da entidade
public class Produto {

    @Id//PRIMARY KEY
    @Column(name = "id")// não é obrigatória nas propriedades que tem o mesmo nome no  BD, mas vamos colocar
    private String id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private double preco;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
