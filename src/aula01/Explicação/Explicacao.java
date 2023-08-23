package aula01.Explicação;

import java.util.Scanner;

public class Explicacao {
    public static void main(String[] args) throws Exception {
        String input = "";
        double nota1 = 0.0;
        double nota2 = 0.0;
        double media;
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        input = entrada.nextLine();
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado" + input);
        } else if (media >= 4) {
            System.out.println("Recuperação" + input);
        } else {
            System.out.println("Reprovado" + input
            );
        }
    }

}
