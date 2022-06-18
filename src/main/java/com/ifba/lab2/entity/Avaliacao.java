package com.ifba.lab2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "table_avaliacao")
@Table(name = "table_avaliacao")

public class Avaliacao {
    @Id
    @GeneratedValue
    @Column(name = "id_avaliacao")
     BigInteger id;

    @Column(name = "orinalidade_avaliacao")
     float originalidade;

    @Column(name = "conteudo_avaliacao")
     float conteudo;

    @Column(name = "apresentacao_avaliacao")
     float apresentacao;

    @Column(name = "media_avaliacao")
     float media;

    public void setId(BigInteger id) {
        this.id = id;
    }
    public BigInteger getId() {
        return id;
    }
    public void setOriginalidade(float originalidade) {
        this.originalidade = originalidade;
    }
    public float getOriginalidade() {
        return originalidade;
    }
    public void setConteudo(float conteudo) {
        this.conteudo = conteudo;
    }
    public float getConteudo() {
        return conteudo;
    }

    public void setApresentacao(float apresentacao) {
        this.apresentacao = apresentacao;
    }

    public float getApresentacao() {
        return apresentacao;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getMedia() {
        return media;
    }

    public float mediaDoArtigo() {

        this.media = (this.apresentacao + this.conteudo + this.originalidade) / 3;

        return this.media;



    }

}
