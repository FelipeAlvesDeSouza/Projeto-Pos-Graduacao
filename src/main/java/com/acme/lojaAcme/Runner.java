package com.acme.lojaAcme;

import com.acme.lojaAcme.Modelo.Cargos;
import com.acme.lojaAcme.Modelo.Funcionario;
import com.acme.lojaAcme.Modelo.FuncionarioTerceirizado;
import com.acme.lojaAcme.Modelo.Setores;
import com.acme.lojaAcme.Servico.ReajusteSalarial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args)
    {
        Funcionario func1 = new Funcionario("João", Arrays.asList("1111-1111"), "Rua A", 3000.0, Setores.DESENVOLVIMENTO, Cargos.JUNIOR);
        FuncionarioTerceirizado func2 = new FuncionarioTerceirizado("Maria", Arrays.asList("2222-2222"), "Rua B", 4000.0, Setores.DEVOPS, Cargos.PLENO, "Empresa X", 12);

        ReajusteSalarial reajusteService = new ReajusteSalarial();

        System.out.println("Salário antes do reajuste: " + func1.getSalario());
        reajusteService.reajustarSalario(func1, 10);
        System.out.println("Salário após o reajuste: " + func1.getSalario());

    }
}
