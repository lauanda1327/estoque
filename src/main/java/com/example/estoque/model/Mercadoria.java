package com.example.estoque.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Mercadoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMercadoria;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double precoDeVenda;

    @Column(nullable = false)
    private Double precoDeCompra;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String marca;

    public double consultarPreco() {
        return precoDeVenda;
    }

    public double valorGanhoPorUnidade() {
        return precoDeVenda - precoDeCompra;
    }
}
