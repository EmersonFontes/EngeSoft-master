package com.ifba.lab2.controller;

import com.ifba.lab2.entity.Tema;
import com.ifba.lab2.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Tema")
public class TemaController {

    @Autowired
    private TemaRepository temaRepository;

    @GetMapping
    public List<Tema> listar() {return temaRepository.findAll(); }


    @PostMapping
    public void incluir(@RequestBody Tema tema){
        temaRepository.save(tema);
    }

    @PutMapping
    public void alterar(@RequestBody Tema tema){
        temaRepository.save(tema);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        temaRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Tema> ler(@PathVariable BigInteger id){
        return temaRepository.findById(id);
    }
}
