package com.ifba.lab2.controller;

import com.ifba.lab2.entity.Avaliacao;
import com.ifba.lab2.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Avaliacao")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @GetMapping
    public List<Avaliacao> listar() {return avaliacaoRepository.findAll(); }

    @PostMapping
    public void incluir(@RequestBody Avaliacao avaliacao){
        avaliacao.setMedia(avaliacao.mediaDoArtigo());
        avaliacaoRepository.save(avaliacao);

    }

    @PutMapping
    public void alterar(@RequestBody Avaliacao avaliacao){
        avaliacaoRepository.save(avaliacao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        avaliacaoRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Avaliacao> ler(@PathVariable BigInteger id){
        return avaliacaoRepository.findById(id);
    }
}
