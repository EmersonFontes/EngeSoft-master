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

    public boolean VerificarTema(){
        return true;
    }

    public int ArtigosSub(){
        return 0;
    }
    
    public void ArtigosSelecionados(){
        
    }


}
