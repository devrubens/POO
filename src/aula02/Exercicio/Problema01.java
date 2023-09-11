package aula02.Exercicio;
import java.util.Scanner;

public class Problema01 {

    public static void main(String[] args) {
    
        int ingressosVendidos = 120;
        float precoIngresso = 5;
        float despesas = 200;
        float lucroEsperado = 0;

        for (float i = 5; i >= 1; i -= 0.5) {
            precoIngresso = i;
            lucroEsperado = (ingressosVendidos * precoIngresso) - despesas;
            System.out.println("Preço do ingresso: " + precoIngresso + " Lucro esperado: " + lucroEsperado);
        }




    }
}
