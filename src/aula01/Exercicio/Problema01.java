package aula01.Exercicio;
import java.util.Scanner;


public class Problema01 {
    public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float bCentimetros,tCentrimetros;
		
        System.out.println("Digite o valor de B:");
		
        bCentimetros = entrada.nextFloat();
		
        if(bCentimetros > 0){
		    System.out.println("Digite o valor de T:");
		    tCentrimetros = entrada.nextFloat();
		    if(tCentrimetros > 0){
        		float areaDoRetangulo = 70*160;
        		float ladoTrapezio = 160 - tCentrimetros;
        		float baseTrapezio = 160 - bCentimetros;
                float areaDoRetanguloMenor = (baseTrapezio + ladoTrapezio)*35;
                if(areaDoRetanguloMenor == 5600){
                    System.out.println("O valor da nota se perdeu.");
                    System.exit(0);
                }else if( areaDoRetanguloMenor > 5600){
                    System.out.println("A nota é de Francisca.");
                    System.exit(0);
                }else{
                    System.out.println("A nota é do Francisco.");
                    System.exit(0);
                }
		    }else{
		        System.out.println("Digite um valor entre 0 e 160");
		        System.exit(0);
		    }
	    }else if(bCentimetros > 160){
            System.out.println("Digite um valor entre 0 e 160");
            System.exit(0);
        }else{
            System.out.println("Digite um valor entre 0 e 160");
            System.exit(0);
        }
		
	}	
}
