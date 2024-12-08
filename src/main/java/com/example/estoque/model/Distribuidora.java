package com.example.estoque.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Distribuidora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDistribuidora;

    @Column(nullable = false, unique = true)
    private String cnpj;

    @Column(nullable = false)
    private String nomeFantasia;
}
