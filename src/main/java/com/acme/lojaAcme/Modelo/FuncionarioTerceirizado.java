package com.acme.lojaAcme.Modelo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class FuncionarioTerceirizado extends Funcionario{
    private String nome;
    private List<String> telefone;
    private String endereco;
    private Double salario;
    private Setores setor;
    private Cargos cargo;
    private String empresaContratada;
    private int permanencia;


    public FuncionarioTerceirizado(String nome, List<String> telefone, String endereco, Double salario, Setores setor, Cargos cargo, String empresaContratada, int permanencia)
    {
        super(nome, telefone, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.permanencia = permanencia;
    }


}
