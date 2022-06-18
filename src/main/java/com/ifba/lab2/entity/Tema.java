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
@Entity(name="table_tema")
@Table(name="table_tema")
public class Tema {
    @Id
    @GeneratedValue
    @Column(name = "id_tema")
    BigInteger id;

    @Column(name = ("nome_tema"))
    String nome;

    @OneToMany
    @JoinColumn(name = "id_tema")
    List<Edicao> edicoes = new ArrayList<>();

    @ManyToMany(mappedBy = "temas")
    List<Avaliador> avaliadores = new ArrayList<>();

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

    public List<Edicao> getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(List<Edicao> edicoes) {
        this.edicoes = edicoes;
    }

    public List<Avaliador> getAvaliadores() {
        return avaliadores;
    }

    public void setAvaliadores(List<Avaliador> avaliadores) {
        this.avaliadores = avaliadores;
    }
}
