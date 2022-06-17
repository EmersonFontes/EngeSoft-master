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
@Entity(name = "table_avaliacao")
@Table(name = "table_avaliacao")

public class Avaliacao {
    @Id
    @Column(name = "id_avaliacao")
    BigInteger id;

    @Column(name = "oriinalidade_avaliacao")
    float originalidade;

    @Column(name = "conteudo_avaliacao")
    float conteúdo;

    @Column(name = "apresentacao_avaliacao")
    float apresentação;

    @Column(name = "media_avaliacao")
    float media;
}
