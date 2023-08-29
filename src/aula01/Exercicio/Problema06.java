package aula01.Exercicio;

import java.util.Scanner;

public class Problema06 {
    
    public static void main(String[] args) {
        int retangulo1x0,retangulo1x1,retangulo1y0,retangulo1y1;
        int retangulo2x0,retangulo2x1,retangulo2y0,retangulo2y1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro retangulo: ");
        System.out.println("x0: ");
        retangulo1x0 = entrada.nextInt();
        System.out.println("y0: ");
        retangulo1y0 = entrada.nextInt();
        System.out.println("x1: ");
        retangulo1x1 = entrada.nextInt();
        System.out.println("y1: ");
        retangulo1y1 = entrada.nextInt();

        System.out.println("Digite as coordenadas do segundo retangulo: ");
        System.out.println("x0: ");
        retangulo2x0 = entrada.nextInt();
        System.out.println("y0: ");
        retangulo2y0 = entrada.nextInt();
        System.out.println("x1: ");
        retangulo2x1 = entrada.nextInt();
        System.out.println("y1: ");
        retangulo2y1 = entrada.nextInt();

        if(retangulo1x0 > retangulo1x1 || retangulo1y0 > retangulo1y1 || retangulo2x0 > retangulo2x1 || retangulo2y0 > retangulo2y1){
            System.out.println("Digite as coordenadas corretamente: ");
            System.exit(0);
        } 
        if(retangulo1x0 > retangulo2x1 || retangulo1x1 < retangulo2x0 || retangulo1y0 > retangulo2y1 || retangulo1y1 < retangulo2y0){
            System.out.println("Boooh! Boooh! Boooh! Boooh! Boooh! Boooh! Boooh!");
            System.out.println("Os retangulos nao se interceptam.");
        }else{
            System.out.println("Sigamos em frete!");
            System.out.println("Os retangulos se interceptam.");
        }






    }


}
