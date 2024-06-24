package com.acme.lojaAcme.Patterns.Strategy;

import com.acme.lojaAcme.Modelo.Funcionario;

public interface IReajusteStrategy {
    void aplicarReajuste(Funcionario funcionario, Double percentual);
}
