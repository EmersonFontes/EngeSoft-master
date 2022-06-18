package com.ifba.lab2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="table_edicao")
@Table(name="table_edicao")

public class Edicao {

    @Id
    @Column(name = "id_edicao")
    BigInteger id;

    @OneToMany
    @JoinColumn(name="id_edicao")
    List<Artigo> artigos = new ArrayList<>();


    @Column(name = ("volume_edicao"))
    int volume;

    @Column(name = ("numero_edicao"))
    int numero;

    @Column(name = "data_edicao")
    Date data = new Date();

    @Column(name = ("tema_edicao"))
    String tema;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
