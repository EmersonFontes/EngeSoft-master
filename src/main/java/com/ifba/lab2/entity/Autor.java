package com.ifba.lab2.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="table_autor")
@Table(name="table_autor")

public class Autor {

    @Id
    @GeneratedValue
    @Column(name = "id_autor")
    private BigInteger id;

    @Column(name = ("nome_autor"))
    private String nome;

    @Column(name = ("email_autor"))
    private String email;

    @Column(name = ("instituicao_autor"))
    private String intituicao;

    @Column(name = ("endereco_autor"))
    private String endereco;

    @ManyToMany(mappedBy = "autores")
    List<Artigo> artigos = new ArrayList<>();

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntituicao() {
        return intituicao;
    }

    public void setIntituicao(String intituicao) {
        this.intituicao = intituicao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }
}
