package me.dio.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numero;
    private String agencia;
    @Column(precision = 13, scale = 2)
    private BigDecimal saldo;
    @Column(name = "limite_adicional",precision = 13, scale = 2)
    private BigDecimal limite;

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }


}
