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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public List<Novidade> getNovidades() {
        return novidades;
    }

    public void setNovidades(List<Novidade> novidades) {
        this.novidades = novidades;
    }
}
