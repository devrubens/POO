package aula01.Exercicio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problema05 {
    
    public static void main(String[] args) {
		int [] posicao = new int [16];
		int posicaoLiu = 0;
		int posicaoZhao = 0;
		int j = 1;
		for (int i = 0; i < 16; i++) {
            posicao[i] = j;
            j++;
        }

    	for (int i = 0; i < 16; i++) {
            if(posicao[i] == 7){
                posicaoLiu = i;
                
            }else if(posicao[i] == 1){
                posicaoZhao = i;
                
            }
        }
        if((posicaoZhao / 8) == (posicaoLiu / 8)){
            System.out.println("Semifinal do campeonato");
        }else if((posicaoLiu / 4) == (posicaoZhao / 4)){
            System.out.println("Quartas de final do campenato");
        }else if((posicaoZhao / 2) == (posicaoLiu / 2)){
            System.out.println("Oitavas de final do campeonato");
        }else{
            System.out.println("Final do campeonato");
        }
    	
        
	}
}
