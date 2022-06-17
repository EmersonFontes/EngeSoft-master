package com.ifba.lab2.repository;

import com.ifba.lab2.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AutorRepository extends JpaRepository<Autor, BigInteger> {
}
