package aula01.Exercicio;
import java.util.Scanner;


public class Problema02 {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor, quantidadeDeParcelas;
		System.out.println("Digite o valor:");
		valor = entrada.nextInt();
		System.out.println("Digite a quantidade de parcelas:");
		quantidadeDeParcelas = entrada.nextInt();
		if (quantidadeDeParcelas <= 18 && quantidadeDeParcelas >= 1 ){
		    int resto = valor % quantidadeDeParcelas;
		    int cont = 1;
		    if( resto == 0){
    		    while (cont < quantidadeDeParcelas){
    		        int parcela = valor / quantidadeDeParcelas;
    		        System.out.println(parcela);
    		        cont++;
    		    }
		    }else{
		        while (cont <= quantidadeDeParcelas){
    		        int parcela = valor / quantidadeDeParcelas;
    		        if(cont > resto){
    		            System.out.println(parcela);
    		        }else{
    		            System.out.println(parcela + resto/resto);
    		        }
    		        cont++;
    		    }
		    }
		} 
		
		
	}
}
