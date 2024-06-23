package com.acme.lojaAcme.Servico;

import com.acme.lojaAcme.Modelo.Funcionario;
import com.acme.lojaAcme.Modelo.FuncionarioTerceirizado;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ReajusteSalarial{

    public void aplicarReajuste(Funcionario funcionario, Double percentual)
    {
        if (isTerceirizado(funcionario))
            throw new UnsupportedOperationException("Reajuste não aplicável para funcionários terceirizados");

        System.out.println("Aplicando reajuste...");

        funcionario.setSalario(funcionario.getSalario()
                .add(funcionario.getSalario()
                        .multiply(new BigDecimal(percentual/100)))
                .setScale(2, RoundingMode.FLOOR));
    }
    public boolean isTerceirizado(Funcionario funcionario)
    {
        return funcionario instanceof FuncionarioTerceirizado;
    }
}
