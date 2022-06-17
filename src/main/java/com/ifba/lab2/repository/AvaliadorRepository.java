package com.ifba.lab2.repository;

import com.ifba.lab2.entity.Avaliador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AvaliadorRepository extends JpaRepository<Avaliador, BigInteger> {

}
