package com.ifba.lab2.repository;

import com.ifba.lab2.entity.Edicao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface EdicaoRepository extends JpaRepository<Edicao, BigInteger> {
}
