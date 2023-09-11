package aula02.Exercicio;
import java.util.Scanner;  

public class Problema02 {
    
    public static void main (String[] args){

        char codigo;
        float valor;
        float totalVista = 0;
        float totalPrazo = 0;
        float totalCompras = 0;
        float primeiraPrestacao = 0;



        for (int i = 0; i < 15; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o valor da compra:");
            valor = input.nextFloat();
            System.out.println("Digite o código da compra:");
            codigo = input.next().charAt(0);
            if (codigo == 'V' || codigo == 'v') {
                totalVista += valor;
            } else if (codigo == 'P' || codigo == 'p') {
                totalPrazo += valor;
            }
            totalCompras += valor;
            primeiraPrestacao = totalPrazo / 3;


        }

        System.out.println("Total das compras à vista: " + totalVista);
        System.out.println("Total das compras a prazo: " + totalPrazo);
        System.out.println("Total das compras efetuadas: " + totalCompras);
        System.out.println("Valor da primeira prestação das compras a prazo: " + primeiraPrestacao);



    }
}
