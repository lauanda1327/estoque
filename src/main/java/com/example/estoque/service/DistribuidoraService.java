package com.example.estoque.service;

import com.example.estoque.model.Distribuidora;
import com.example.estoque.repository.DistribuidoraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistribuidoraService {

    private final DistribuidoraRepository distribuidoraRepository;

    public DistribuidoraService(DistribuidoraRepository distribuidoraRepository) {
        this.distribuidoraRepository = distribuidoraRepository;
    }

    public List<Distribuidora> listarTodas() {
        return distribuidoraRepository.findAll();
    }

    public Distribuidora salvarOuAtualizar(Distribuidora distribuidora) {
        return distribuidoraRepository.save(distribuidora);
    }

    public void remover(Long id) {
        distribuidoraRepository.deleteById(id);
    }
}

