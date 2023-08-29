package aula01.Exercicio;

import java.util.Scanner;

public class Problema04 {
    
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int D, pontuacao;
		int contador = 0;
		int limite = 15;
		System.out.println("Digite a posição do robô: ");
		D = entrada.nextInt();
		if (D <= 800){
		    pontuacao = 1;
		    System.out.println("Pontuação: "+pontuacao);
		}else if(D > 800 && D <= 1400){
		    pontuacao = 2;
		    System.out.println("Pontuação: "+pontuacao);
		}else if(D > 1400 && D <= 2000){
		    pontuacao = 3;
		    System.out.println("Pontuação: "+pontuacao);
		}else{
		    
		}
	}

}
