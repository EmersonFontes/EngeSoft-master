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
@Entity(name="table_avaliador")
@Table(name="table_avaliador")

public class Avaliador {

    @Id
    @GeneratedValue
    @Column(name = "id_avaliador")
    BigInteger id;

    @Column(name = "nome_avaliador")
    String nome;

    @Column(name = "email_avaliador")
    String email;



    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "id_avaliador"),
                inverseJoinColumns = @JoinColumn(name = "id_tema"))
    List<Tema> temas = new ArrayList<>();

    @ManyToMany(mappedBy = "avaliadores")
    List<Artigo> artigos = new ArrayList<>();

    @Column(name = "chefe_avaliador")
    Boolean avaliadorChefe;

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

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }

    public Boolean getAvaliadorChefe() {
        return avaliadorChefe;
    }

    public void setAvaliadorChefe(Boolean avaliadorChefe) {
        this.avaliadorChefe = avaliadorChefe;
    }

    public boolean AvaliadorChefe(){

        if(this.avaliadorChefe){
            return true;
        }else{
            return false;
        }
    }

    
}
