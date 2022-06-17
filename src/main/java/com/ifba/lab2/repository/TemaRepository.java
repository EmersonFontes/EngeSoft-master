package com.ifba.lab2.repository;

import com.ifba.lab2.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface TemaRepository extends JpaRepository<Tema, BigInteger> {
}
