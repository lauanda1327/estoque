package com.example.estoque.service;

import com.example.estoque.model.Estoque;
import com.example.estoque.repository.EstoqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

    private final EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    public List<Estoque> listarTodos() {
        return estoqueRepository.findAll();
    }

    public Estoque salvarOuAtualizar(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    public void remover(Long id) {
        estoqueRepository.deleteById(id);
    }
}
