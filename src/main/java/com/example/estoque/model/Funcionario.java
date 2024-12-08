package com.example.estoque.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionario;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private LocalDateTime dataAcesso;

    @Column(nullable = false)
    private String horaAcesso;

    public void autenticar() {
        // Implementação do método autenticar
    }

    public void gerenciarAlerta() {
        // Implementação do método gerenciar alerta
    }
}
