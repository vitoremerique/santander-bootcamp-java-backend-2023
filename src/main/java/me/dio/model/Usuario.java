package me.dio.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tb_Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;
    @OneToOne(cascade = CascadeType.ALL)
    private Cartao cartao;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Recurso> recursos;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Novidade> novidades;
}
