package com.ifba.lab2.controller;



import com.ifba.lab2.entity.Edicao;

import com.ifba.lab2.repository.EdicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Edicao")
public class EdicaoController {

    @Autowired
    private EdicaoRepository edicaoRepository;

    @GetMapping
    public List<Edicao> listar() {return edicaoRepository.findAll(); }


    @PostMapping
    public void incluir(@RequestBody Edicao edicao){
        edicaoRepository.save(edicao);
    }

    @PutMapping
    public void alterar(@RequestBody Edicao edicao){
        edicaoRepository.save(edicao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        edicaoRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Edicao> ler(@PathVariable BigInteger id){
        return edicaoRepository.findById(id);
    }
}
