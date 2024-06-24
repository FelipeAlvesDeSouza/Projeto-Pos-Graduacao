package com.acme.lojaAcme.Patterns.Strategy;

import com.acme.lojaAcme.Modelo.Funcionario;
import com.acme.lojaAcme.Modelo.FuncionarioTerceirizado;

public class ReajusteService {

    private IReajusteStrategy strategy;

    public ReajusteService(IReajusteStrategy strategy) {
        this.strategy = strategy;
    }

    public void aplicarReajuste(Funcionario funcionario, Double percentual) {
        if (funcionario instanceof FuncionarioTerceirizado) {
            throw new UnsupportedOperationException("Reajuste não aplicável para funcionários terceirizados");
        }
        strategy.aplicarReajuste(funcionario, percentual);
    }
}
