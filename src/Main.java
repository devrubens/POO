import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "";
        double nota1 = 0.0;
        double nota2 = 0.0;
        double media=
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
