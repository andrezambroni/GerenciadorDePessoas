package com.api.gerenciador.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.gerenciador.repository.PessoaRepository;
import com.api.gerenciador.controller.PessoaController;



public class PessoaService {

    
    @Autowired
    private PessoaRepository pessoaRepository; // Assuming you have a PessoaRepository injected

    public void cadastrarPessoa(PessoaController pessoa) {

        PessoaRepository.save(pessoa); // Use the PessoaRepository to persist the person to the database
        
    }
}
