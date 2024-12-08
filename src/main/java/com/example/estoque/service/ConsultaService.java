package com.example.estoque.service;

import com.example.estoque.model.Consulta;
import com.example.estoque.repository.ConsultaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    private final ConsultaRepository consultaRepository;

    public ConsultaService(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public List<Consulta> listarTodas() {
        return consultaRepository.findAll();
    }

    public Consulta salvarOuAtualizar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public void remover(Long id) {
        consultaRepository.deleteById(id);
    }
}
