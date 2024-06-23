package com.acme.lojaAcme;

import com.acme.lojaAcme.Modelo.Cargo;
import com.acme.lojaAcme.Modelo.Funcionario;
import com.acme.lojaAcme.Modelo.FuncionarioTerceirizado;
import com.acme.lojaAcme.Modelo.Setor;
import com.acme.lojaAcme.Servico.ReajusteSalarial;

import java.math.BigDecimal;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args)
    {
        Funcionario func1 = new Funcionario("Felipe", Arrays.asList("1111-1111"), "Rua A", new BigDecimal(3000.00), Setor.DESENVOLVIMENTO, Cargo.JUNIOR);
        FuncionarioTerceirizado func2 = new FuncionarioTerceirizado("Maria", Arrays.asList("2222-2222"), "Rua B", new BigDecimal(4000.00), Setor.DEVOPS, Cargo.PLENO, "Apple", 12);

        ReajusteSalarial reajusteService = new ReajusteSalarial();

        System.out.println("Salário antes do reajuste: " + func1.getSalario());
        reajusteService.aplicarReajuste(func1, 10.20);
        System.out.println("Salário após o reajuste: " + func1.getSalario());

        System.out.println("Salário antes do reajuste funcionario Terceirizado: " + func2.getSalario());
        reajusteService.aplicarReajuste(func2, 10.20);
        System.out.println("Salário após o reajuste: " + func2.getSalario());

    }
}
