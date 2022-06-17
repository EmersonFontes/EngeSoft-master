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


    //@ManyToMany(mappedBy = "")
    // List<Artigo> artigos =new ArrayList<>();

}
