package com.example.estoque.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstoque;

    @ManyToOne
    @JoinColumn(name = "mercadoria_id", nullable = false)
    private Mercadoria mercadoria;

    @Column(nullable = false)
    private Integer quantidade;

    public Integer consultarQuantidade() {
        return quantidade;
    }
}
