package com.example.estoque.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false, unique = true)
    private String cpf;

    public void removerCliente() {
        // Implementação do método para remover cliente
    }

    public void cadastrarCliente() {
        // Implementação do método para cadastrar cliente
    }
}
