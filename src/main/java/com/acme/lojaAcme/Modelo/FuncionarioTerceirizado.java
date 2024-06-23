package com.acme.lojaAcme.Modelo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class FuncionarioTerceirizado extends Funcionario {

    private String empresaContratada;
    private int permanenciaEmDIas;

    public FuncionarioTerceirizado(String nome, List<String> telefone, String endereco, BigDecimal salario, Setor setor, Cargo cargo, String empresaContratada, int permanenciaEmDIas)
    {
        super(nome, telefone, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.permanenciaEmDIas = permanenciaEmDIas;
    }

}
