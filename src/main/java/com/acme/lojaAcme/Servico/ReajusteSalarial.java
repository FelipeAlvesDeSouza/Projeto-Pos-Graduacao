package com.acme.lojaAcme.Servico;

import com.acme.lojaAcme.Modelo.Funcionario;
import com.acme.lojaAcme.Modelo.FuncionarioTerceirizado;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteSalarial  {


    public void reajustarSalario(Funcionario funcionario, double percentual) {


        if (funcionario instanceof FuncionarioTerceirizado) {
            throw new UnsupportedOperationException("Reajuste não aplicável para funcionários terceirizados");
        }

        double novoSalario = funcionario.getSalario() * (1 + percentual / 100);
        funcionario.setSalario(novoSalario);
    }
}
