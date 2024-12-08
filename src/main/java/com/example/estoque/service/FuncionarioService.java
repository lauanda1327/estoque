package com.example.estoque.service;

import com.example.estoque.model.Funcionario;
import com.example.estoque.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvarOuAtualizar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void remover(Long id) {
        funcionarioRepository.deleteById(id);
    }
}

