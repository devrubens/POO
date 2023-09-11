package aula02.Exercicio;
import java.util.Scanner;

public class Problema03 {
    
    public static void main (String[] args){

        float alturaChico = 1.5f;
        float alturaZe = 1.1f;
        int anos = 0;

        while (alturaZe < alturaChico) {
            alturaChico += 0.02;
            alturaZe += 0.03;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Zé seja maior que Chico.");

    }

}
