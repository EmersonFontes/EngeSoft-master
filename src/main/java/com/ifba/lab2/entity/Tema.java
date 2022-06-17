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
@Entity(name="table_tema")
@Table(name="table_tema")
public class Tema {
    @Id
    BigInteger id;

    @Column(name = ("tema"))
    String tema;
}
