package com.acme.lojaAcme.Patterns.Factory;

import com.acme.lojaAcme.Modelo.Cargo;
import com.acme.lojaAcme.Modelo.Funcionario;
import com.acme.lojaAcme.Modelo.FuncionarioTerceirizado;
import com.acme.lojaAcme.Modelo.Setor;

import java.math.BigDecimal;
import java.util.List;

public class FuncionarioFactory {

    public static Funcionario criarFuncionario(String nome, List<String> telefones, String endereco, BigDecimal salario, Setor setor, Cargo cargo) {
        return new Funcionario(nome, telefones, endereco, salario, setor, cargo);
    }

    public static FuncionarioTerceirizado criarFuncionarioTerceirizado(String nome, List<String> telefones, String endereco, BigDecimal salario, Setor setor, Cargo cargo, String empresaContratada, int permanenciaEmDias) {
        return new FuncionarioTerceirizado(nome, telefones, endereco, salario, setor, cargo, empresaContratada, permanenciaEmDias);
    }
}
