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
@Entity(name="table_artigo")
@Table(name="table_artigo")

public class Artigo {
    @Id
    @Column (name = "id_artigo")
    BigInteger id;

    @Column (name = "titulo_artigo")
    String titulo;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name="id_artigo"),
                inverseJoinColumns = @JoinColumn(name = "id_autor"))
   List<Autor> autores = new ArrayList<>();

    @Column (name = "arquivo_artigo")
    String arquivoArtigo;

}
    

