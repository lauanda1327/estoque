package com.example.estoque.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;

    @Column(nullable = false)
    private String consultarNome;

    @Column(nullable = false)
    private String consultarMarca;

    @Column(nullable = false)
    private String consultarProduto;

    @Column(nullable = false)
    private LocalDateTime dataConsulta;

    public void executarConsulta() {
        // Implementação do método executar consulta
    }
}
