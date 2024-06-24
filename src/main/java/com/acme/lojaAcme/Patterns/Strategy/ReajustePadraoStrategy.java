package com.acme.lojaAcme.Patterns.Strategy;

import com.acme.lojaAcme.Modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajustePadraoStrategy implements IReajusteStrategy {

    @Override
    public void aplicarReajuste(Funcionario funcionario, Double percentual) {
        funcionario.setSalario(funcionario.getSalario()
                .add(funcionario.getSalario()
                        .multiply(new BigDecimal(percentual / 100)))
                .setScale(2, RoundingMode.FLOOR));
    }
}
