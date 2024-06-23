package com.acme.lojaAcme.Modelo;

import java.math.BigDecimal;
import java.util.List;

public class FuncionarioContratado extends Funcionario{


    public FuncionarioContratado(String nome, List<String> telefone, String endereco, Double salario, Setores setor, Cargos cargo)
    {
        super(nome, telefone, endereco, salario, setor, cargo);
    }




    public Double reajusteSalarial(Double reajusteSalario)
    {

        System.out.println("Aplicando Reajuste...");

        Double reajuste = reajusteSalario += 10;


        return reajuste;
    }


}
