package com.acme.lojaAcme.Modelo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Funcionario {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private BigDecimal salario;
    private Setor setor;
    private Cargo cargo;

    public Funcionario (String nome, List<String> telefones , String endereco, BigDecimal salario, Setor setor, Cargo cargo)
    {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }
}
