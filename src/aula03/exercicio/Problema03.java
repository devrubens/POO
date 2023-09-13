/*Escreva um programa para gerenciar os voos de uma companhia aérea. Para isso crie uma classe em
que cada objeto representa um voo que acontece em determinada data e em determinado horário. Cada
voo possui no máximo 100 passageiros, e a classe permite controlar a ocupação das vagas. Faça um
programa para testar a classe criada. A classe deve ter os seguintes métodos:
construtor Configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para
armazenar a data utilize um objeto da classe Data, criada na questão anterior);

proximoLivre Retorna o número da próxima cadeira livre
verifica Verifica se o número da cadeira recebido como parâmetro está ocupada
ocupa Ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e
retorna True se cadeira ainda não estiver ocupada e False caso contrário
retornaVvagas Retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
retornaVoo Retorna o número do vôo
retornaData Retorna a data do vôo (na forma de objeto) */

package aula03.exercicio;

import java.util.Date;

public class Problema03 {
    private int numeroVoo;
    private Date data;
    private boolean[] ocupacao;
    private int capacidade;

    public Problema03(int numeroVoo, Date data, int capacidade) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.capacidade = capacidade;
        this.ocupacao = new boolean[capacidade];
        for (int i = 0; i < capacidade; i++) {
            ocupacao[i] = false;
        }
    }

    public int proximoLivre() {
        for (int i = 0; i < capacidade; i++) {
            if (!ocupacao[i]) {
                return i + 1; 
            }
        }
        return -1; 
    }

    public boolean verifica(int numeroCadeira) {
        if (numeroCadeira >= 1 && numeroCadeira <= capacidade) {
            return ocupacao[numeroCadeira - 1]; 
        } else {
            return false; 
        }
    }

    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira >= 1 && numeroCadeira <= capacidade && !ocupacao[numeroCadeira - 1]) {
            ocupacao[numeroCadeira - 1] = true;
            return true; 
        } else {
            return false; 
        }
    }

    public int retornaVagas() {
        int vagas = 0;
        for (boolean cadeira : ocupacao) {
            if (!cadeira) {
                vagas++;
            }
        }
        return vagas;
    }

    public int retornaVoo() {
        return numeroVoo;
    }

    public Date retornaData() {
        return data;
    }

    public static void main(String[] args) {
        
        Date dataVoo = new Date(); 
        Problema03 voo1 = new Problema03(101, dataVoo, 100);

        System.out.println("Número do Voo: " + voo1.retornaVoo());
        System.out.println("Data do Voo: " + voo1.retornaData());
        System.out.println("Próxima cadeira livre: " + voo1.proximoLivre());
        System.out.println("Cadeira 5 está ocupada: " + voo1.verifica(5));
        System.out.println("Ocupando cadeira 5: " + voo1.ocupa(5));
        System.out.println("Cadeira 5 está ocupada: " + voo1.verifica(5));
        System.out.println("Vagas disponíveis: " + voo1.retornaVagas());
    }
}
