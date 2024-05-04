package com.api.gerenciador.repository;

import java.util.List;
import java.util.Optional;

import com.api.gerenciador.controller.PessoaController;
import com.api.gerenciador.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    static Pessoa save(Pessoa pessoa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    static Optional<Pessoa> findById(Long matricula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    static void deleteById(Long matricula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    static List<Pessoa> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    static void save(PessoaController pessoa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
