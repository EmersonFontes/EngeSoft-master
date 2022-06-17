package com.ifba.lab2.controller;

import com.ifba.lab2.entity.Avaliador;
import com.ifba.lab2.repository.AvaliadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Avaliador")
public class AvaliadorController {
    @Autowired
    private AvaliadorRepository avaliadorRepository;

    @GetMapping
    public List<Avaliador> listar() {return avaliadorRepository.findAll(); }


    @PostMapping
    public void incluir(@RequestBody Avaliador avaliador){
        avaliadorRepository.save(avaliador);
    }

    @PutMapping
    public void alterar(@RequestBody Avaliador avaliador){
        avaliadorRepository.save(avaliador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        avaliadorRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Avaliador> ler(@PathVariable BigInteger id){
        return avaliadorRepository.findById(id);
    }
}
