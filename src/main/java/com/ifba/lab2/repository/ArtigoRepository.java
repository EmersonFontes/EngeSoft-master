package com.ifba.lab2.repository;

import com.ifba.lab2.entity.Artigo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ArtigoRepository  extends JpaRepository<Artigo, BigInteger> {

}
