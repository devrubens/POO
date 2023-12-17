package Atividade06;

/* Neste problema, implemente a classe Funcionario com nome, salario e os métodos
aumentoSalarial(double valor), ganhoAnual() e exibeDados(), que imprime os valores do funcionário.
Para isso, crie a classe Assistente, que também é um funcionário, e que possui um número de matrícula
(faça os métodos GET e SET) e sobrescreva o método exibeDados(). Por fim, sabendo que os Assistentes
Técnicos possuem um bônus salarial e que os Assistentes Administrativos possuem um turno (dia ou
noite) e um adicional noturno, crie as classes Tecnico e Administrativo e aplique polimorfismo para o
método ganhoAnual() de ambas as classes (Administrativo e Tecnico). Faça um programa principal que
teste a criação de vários funcionários.*/


public class Problema01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 1000f);
        Assistente assistente = new Assistente("Maria", 2000f, 123);
        Tecnico tecnico = new Tecnico("José", 3000f, 456, 1000f);
        Administrativo administrativo = new Administrativo("Ana", 4000f, 789, "Noite", 500f);

        funcionario.exibeDados();
        assistente.exibeDados();
        tecnico.exibeDados();
        administrativo.exibeDados();
    }
}  









