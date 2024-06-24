# Projeto Loja Acme

Este projeto simula uma empresa fictícia chamada ACME, com funcionalidades para gerenciar funcionários e aplicar reajustes salariais.

A primeira entrega do projeto(COMMIT), fiz a estrutura total do projeto como foi pedido: Entidade Funcionário, Funcionário terceirizado e um método onde aplica reajuste apenas para funcionario Contratado e não Terceirizado, funcionando tudo;

Segunda Parte da entrega(COMMIT), APLIQUEI CLEAN CODE -> fiz a refatoração completa, onde melhorei nome de métodos/classes/variaveis e retirei todo código redundante para um código mais limpo e legível.

Terceira Parte da Entrega(COMMIT), criei uma pasta separada chamada PATTERNS para implementar de forma simples, 2 Patterns criacionais, 1 Pattern estrutural e 1 Pattern comportamental sobre meu projeto de Funcionários e Reajuste descritos abaixo. 

Padrões de Projeto Utilizados:

Factory Method
Utilizado para criar instâncias de funcionários e funcionários terceirizados de forma simples e centralizada.

Singleton
Utilizado para garantir que a classe ReajusteSalarialSingleton tenha apenas uma instância e forneça um ponto de acesso global a essa instância.

Strategy
Utilizado para encapsular o reajuste salarial em classes separadas e permitir que os códigos sejam trocados dinamicamente.

Adapter
Utilizado para adaptar o formato de números de telefone para um formato específico, removendo caracteres não numéricos.
