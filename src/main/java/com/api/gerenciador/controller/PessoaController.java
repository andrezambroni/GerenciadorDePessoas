package com.api.gerenciador.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gerenciador.model.Pessoa;
import com.api.gerenciador.repository.PessoaRepository;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository; // Supondo que você tenha um PessoaRepository

    // ... outros métodos

    /**
     * Recupera uma lista de todas as pessoas.
     *
     * @return Lista de objetos `Pessoa`.
     */
    @GetMapping("/all")
    public List<Pessoa> getAllPeople() {
        return PessoaRepository.findAll();
    }

    @PostMapping("/add")
    public Pessoa addPessoa(@RequestBody Pessoa pessoa) {
        return PessoaRepository.save(pessoa);
    }

       @GetMapping
    public List<Pessoa> listar() {
        return PessoaRepository.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Pessoa pessoa) {
        PessoaRepository.save(pessoa);
    }

    @PutMapping
    public void alterar(@RequestBody Pessoa pessoa){
        PessoaRepository.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long matricula){
        PessoaRepository.deleteById(matricula);
    }

    @GetMapping("/{id}")
    public Optional<Pessoa> ler(@PathVariable Long matricula){
        return PessoaRepository.findById(matricula);
    }

}
