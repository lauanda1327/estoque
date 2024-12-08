package com.example.estoque.service;

import com.example.estoque.model.Mercadoria;
import com.example.estoque.repository.MercadoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MercadoriaService {

    private final MercadoriaRepository mercadoriaRepository;

    public MercadoriaService(MercadoriaRepository mercadoriaRepository) {
        this.mercadoriaRepository = mercadoriaRepository;
    }

    public List<Mercadoria> listarTodas() {
        return mercadoriaRepository.findAll();
    }

    public Mercadoria salvarOuAtualizar(Mercadoria mercadoria) {
        return mercadoriaRepository.save(mercadoria);
    }

    public void remover(Long id) {
        mercadoriaRepository.deleteById(id);
    }
}

