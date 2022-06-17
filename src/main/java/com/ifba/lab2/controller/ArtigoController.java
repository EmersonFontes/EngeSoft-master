package com.ifba.lab2.controller;


import com.ifba.lab2.entity.Artigo;
import com.ifba.lab2.repository.ArtigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Artigo")
public class ArtigoController {

    @Autowired
    private ArtigoRepository artigoRepository;

    @GetMapping
    public List<Artigo> listar() {return artigoRepository.findAll(); }


    @PostMapping
    public void incluir(@RequestBody Artigo artigo){
        artigoRepository.save(artigo);
    }

    @PutMapping
    public void alterar(@RequestBody Artigo artigo){
        artigoRepository.save(artigo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        artigoRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Artigo> ler(@PathVariable BigInteger id){
        return artigoRepository.findById(id);
    }
}
