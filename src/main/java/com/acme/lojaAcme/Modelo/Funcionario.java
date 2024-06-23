package com.acme.lojaAcme.Modelo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Funcionario {
    private String nome;
    private List<String> telefone;
    private String endereco;
    private Double salario;
    private Setores setor;
    private Cargos cargo;


    public Funcionario (String nome, List<String> telefone , String endereco, Double salario, Setores setor, Cargos cargo)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

}
