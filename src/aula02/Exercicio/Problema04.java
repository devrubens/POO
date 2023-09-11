package aula02.Exercicio;
import java.util.Scanner;

public class Problema04 {

    public static void main(String[] args) {

        int voto;
        int totalVotos = 0;
        int totalCandidato1 = 0;
        int totalCandidato2 = 0;
        int totalCandidato3 = 0;
        int totalCandidato4 = 0;
        int totalNulos = 0;
        int totalBrancos = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código do seu voto (0 para encerrar): ");
        voto = input.nextInt();

        while (voto != 0) {
            if (voto == 1) {
                totalCandidato1++;
            } else if (voto == 2) {
                totalCandidato2++;
            } else if (voto == 3) {
                totalCandidato3++;
            } else if (voto == 4) {
                totalCandidato4++;
            } else if (voto == 5) {
                totalNulos++;
            } else if (voto == 6) {
                totalBrancos++;
            } else {
                System.out.println("CÓDIGO INVÁLIDO");
            }
            totalVotos++;
            System.out.println("Digite o código do seu voto (0 para encerrar): ");
            voto = input.nextInt();
        }

        float porcentagemNulos = (totalNulos * 100f) / totalVotos;
        float porcentagemBrancos = (totalBrancos * 100f) / totalVotos;
        float porcentagemCandidato1 = (totalCandidato1 * 100f) / totalVotos;
        float porcentagemCandidato2 = (totalCandidato2 * 100f) / totalVotos;
        float porcentagemCandidato3 = (totalCandidato3 * 100f) / totalVotos;
        float porcentagemCandidato4 = (totalCandidato4 * 100f) / totalVotos;

        System.out.println("Total de votos para o candidato 1: " + totalCandidato1);
        System.out.println("Total de votos para o candidato 2: " + totalCandidato2);
        System.out.println("Total de votos para o candidato 3: " + totalCandidato3);
        System.out.println("Total de votos para o candidato 4: " + totalCandidato4);
        System.out.println("Total de votos nulos: " + totalNulos);
        System.out.println("Total de votos em branco: " + totalBrancos);
        System.out.println("Porcentagem de votos nulos: " + porcentagemNulos + "%");
        System.out.println("Porcentagem de votos em branco: " + porcentagemBrancos + "%");
        System.out.println("Porcentagem de votos para o candidato 1: " + porcentagemCandidato1 + "%");
        System.out.println("Porcentagem de votos para o candidato 2: " + porcentagemCandidato2 + "%");
        System.out.println("Porcentagem de votos para o candidato 3: " + porcentagemCandidato3 + "%");
        System.out.println("Porcentagem de votos para o candidato 4: " + porcentagemCandidato4 + "%");

    }
}

