package com.acme.lojaAcme.Patterns.Singleton;

import com.acme.lojaAcme.Modelo.Funcionario;
import com.acme.lojaAcme.Modelo.FuncionarioTerceirizado;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteSalarialSingleton {

    private static ReajusteSalarialSingleton instancia;

    private ReajusteSalarialSingleton() {}

    public static ReajusteSalarialSingleton getInstance() {
        if (instancia == null) {
            instancia = new ReajusteSalarialSingleton();
        }
        return instancia;
    }

    public void aplicarReajuste(Funcionario funcionario, Double percentual) {
        if (isTerceirizado(funcionario))
            throw new UnsupportedOperationException("Reajuste não aplicável para funcionários terceirizados");

        System.out.println("Aplicando reajuste...");

        funcionario.setSalario(funcionario.getSalario()
                .add(funcionario.getSalario()
                        .multiply(new BigDecimal(percentual / 100)))
                .setScale(2, RoundingMode.FLOOR));
    }

    private boolean isTerceirizado(Funcionario funcionario) {
        return funcionario instanceof FuncionarioTerceirizado;
    }
}
