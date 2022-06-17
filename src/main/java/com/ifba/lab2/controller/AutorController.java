package com.ifba.lab2.controller;

import com.ifba.lab2.entity.Autor;
import com.ifba.lab2.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Autor")
public class AutorController {


    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public List<Autor> listar() {return autorRepository.findAll(); }


    @PostMapping
    public void incluir(@RequestBody Autor autor){
        autorRepository.save(autor);
    }

    @PutMapping
    public void alterar(@RequestBody Autor autor){
        autorRepository.save(autor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        autorRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Autor> ler(@PathVariable BigInteger id){
        return autorRepository.findById(id);
    }
}
