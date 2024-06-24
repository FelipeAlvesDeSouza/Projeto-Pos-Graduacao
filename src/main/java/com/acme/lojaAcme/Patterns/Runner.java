package com.acme.lojaAcme.Patterns;

import com.acme.lojaAcme.Modelo.Cargo;
import com.acme.lojaAcme.Modelo.Funcionario;
import com.acme.lojaAcme.Modelo.FuncionarioTerceirizado;
import com.acme.lojaAcme.Modelo.Setor;
import com.acme.lojaAcme.Patterns.Adapter.TelefoneAdapter;
import com.acme.lojaAcme.Patterns.Singleton.ReajusteSalarialSingleton;
import com.acme.lojaAcme.Patterns.Strategy.IReajusteStrategy;
import com.acme.lojaAcme.Patterns.Strategy.ReajustePadraoStrategy;
import com.acme.lojaAcme.Patterns.Strategy.ReajusteService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        // Usando Factory Method
        List<String> telefones1 = Arrays.asList("(11) 95989-3750", "21-8888-8888");
        List<String> telefonesAdaptados1 = telefones1.stream()
                .map(TelefoneAdapter::adaptarTelefone)
                .collect(Collectors.toList());
        Funcionario func1 = com.acme.lojaAcme.Patterns.Factory.FuncionarioFactory.criarFuncionario("Felipe", telefonesAdaptados1, "Rua A", new BigDecimal("3000.00"), Setor.DESENVOLVIMENTO, Cargo.JUNIOR);

        List<String> telefones2 = Arrays.asList("31987654321");
        List<String> telefonesAdaptados2 = telefones2.stream()
                .map(TelefoneAdapter::adaptarTelefone)
                .collect(Collectors.toList());
        FuncionarioTerceirizado func2 = com.acme.lojaAcme.Patterns.Factory.FuncionarioFactory.criarFuncionarioTerceirizado("Maria", telefonesAdaptados2, "Rua B", new BigDecimal("4000.00"), Setor.DEVOPS, Cargo.PLENO, "Empresa X", 12);

        // Usando Singleton
        ReajusteSalarialSingleton reajusteSalarial = ReajusteSalarialSingleton.getInstance();

        // Usando Strategy
        IReajusteStrategy strategy = new ReajustePadraoStrategy();
        ReajusteService reajusteService = new ReajusteService(strategy);

        // Aplicando reajuste usando Singleton
        System.out.println("Salário de Felipe antes do reajuste: " + func1.getSalario());
        reajusteSalarial.aplicarReajuste(func1, 5.42);
        System.out.println("Salário de Felipe após o reajuste: " + func1.getSalario());

        // Tentativa de aplicar reajuste em funcionário terceirizado

        reajusteService.aplicarReajuste(func2, 10.0);


        // Usando Adapter para adaptar o formato de telefone
        System.out.println("Telefone de Felipe antes de adaptar: " + telefones1.get(0));
        System.out.println("Telefone de Felipe após adaptar: " + telefonesAdaptados1.get(0));
    }
}
