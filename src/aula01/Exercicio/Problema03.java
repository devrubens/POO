package aula01.Exercicio;

import java.util.Scanner;

public class Problema03 {
    
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int H, P, F ,D;
		int contador = 0;
		int limite = 15;
		System.out.println("Digite a posição do helicóptero:(0 - 15)");
		H = entrada.nextInt();
		if (H >= 0 && H <= 15){
		    System.out.println("Digite a posição do policial:(0 - 15)");
    		P = entrada.nextInt();
    		if (P >= 0 && P <= 15){
        		System.out.println("Digite a posição do fugitivo:(0 - 15)");
        		F = entrada.nextInt();
        		if (F >= 0 && F <= 15){
            	    System.out.println("Digite a direção: -1 => Para horária ou 1 => Para anti-horário;");
            		D = entrada.nextInt();
            		if (D == -1 || D == 1){
            	        if(D == -1){
            	            if(P < F){
            	                System.out.println("N");
            	            }else{
            	                System.out.println("S");
            	            }
            	        }else{
            	            if(P > F){
            	                System.out.println("N");
            	            }else{
            	                System.out.println("S");
            	            }
            	        }
		            }
		        }
		    }
		}
	}
}
