package com.ifba.lab2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="table_avaliador")
@Table(name="table_avaliador")

public class Avaliador {
    @Id
    BigInteger id;

    @Column(name = "nome_avaliador")
    String nome;

    @Column(name = "email_avaliador")
    String email;

    @Column(name = "tema_avaliador")
    String[] tema;

    @Column(name = "chefe_avaliador")
    Boolean avaliadorChefe;
    
    public void AvaliadorChefe(){}
    
    public void AvaliarCriterios(){}
    
    public void VerificaListadeArtigos(){}
    
}
