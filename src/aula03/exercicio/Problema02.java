/*Escreva um programa que receba os dados de um aluno matriculado em um disciplina do IFCE. Para isso
crie uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas da etapa 1 e 2 notas da etapa
2, média da etapa 1, média da etapa 2 e média final e resultado final (Aprovado, Reprovado, Avaliação
Final. Faz o programa para testar a classe. Escreva os seguintes métodos para esta classe:
calculaMediaPorEtapa Recebe código da etapa e pesos de cada avaliação e calcula a média da etapa
calculaMediaFinal Calcula a média final do aluno
calculaResultadoFinal Calcula o resultado final (Aprovado, Reprovado, Avaliação Final)
apresentaResultado Cria string com o resultado final com todos os dados do aluno */

package aula03.exercicio;

public class Problema02 {
    private int matricula;
    private String nome, resultadoFinal;
    private float nota1Etapa1, nota2Etapa1, nota1Etapa2, nota2Etapa2, mediaEtapa1, mediaEtapa2, mediaFinal;

    public Problema02(int matricula, String nome, float nota1Etapa1, float nota2Etapa1, float nota1Etapa2, float nota2Etapa2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1Etapa1 = nota1Etapa1;
        this.nota2Etapa1 = nota2Etapa1;
        this.nota1Etapa2 = nota1Etapa2;
        this.nota2Etapa2 = nota2Etapa2;
    }

    public float calculaMediaPorEtapa(int etapa, float peso1, float peso2) {
        if (etapa == 1) {
            mediaEtapa1 = (nota1Etapa1 * peso1 + nota2Etapa1 * peso2) / (peso1 + peso2);
            return mediaEtapa1;
        } else if (etapa == 2) {
            mediaEtapa2 = (nota1Etapa2 * peso1 + nota2Etapa2 * peso2) / (peso1 + peso2);
            return mediaEtapa2;
        } else {
            return 0;
        }
    }

    public float calculaMediaFinal(float peso1, float peso2) {
        mediaFinal = (mediaEtapa1 * peso1 + mediaEtapa2 * peso2) / (peso1 + peso2);
        return mediaFinal;
    }

    public String calculaResultadoFinal() {
        if (mediaFinal >= 7) {
            resultadoFinal = "Aprovado";
        } else if (mediaFinal >= 4) {
            resultadoFinal = "Avaliação Final";
        } else {
            resultadoFinal = "Reprovado";
        }
        return resultadoFinal;
    }

    public String apresentaResultado() {
        return "Matrícula: " + matricula + "\nNome: " + nome + "\nNota 1 Etapa 1: " + nota1Etapa1 + "\nNota 2 Etapa 1: " + nota2Etapa1 + "\nNota 1 Etapa 2: " + nota1Etapa2 + "\nNota 2 Etapa 2: " + nota2Etapa2 + "\nMédia Etapa 1: " + mediaEtapa1 + "\nMédia Etapa 2: " + mediaEtapa2 + "\nMédia Final: " + mediaFinal + "\nResultado Final: " + resultadoFinal;
    }

    public static void main(String[] args) {
        Problema02 aluno1 = new Problema02(1, "Raphael", 7, 8, 9, 10);
        aluno1.calculaMediaPorEtapa(1, 2, 3);
        aluno1.calculaMediaPorEtapa(2, 2, 3);
        aluno1.calculaMediaFinal(2, 3);
        aluno1.calculaResultadoFinal();
        System.out.println(aluno1.apresentaResultado());
    }
}
