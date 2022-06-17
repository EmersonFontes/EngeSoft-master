package com.ifba.lab2.repository;

import com.ifba.lab2.entity.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, BigInteger> {
}
