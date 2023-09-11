package aula02.Exercicio;

public class Problema05 {
    
    public static void main(String[] args) {
        
        double salarioMaria = 1000;
        double salarioJoao = salarioMaria / 3;
        double rendimentoMaria = 0.01;
        double rendimentoJoao = 0.03;
        int meses = 0;
        
        while (salarioJoao <= salarioMaria) {
            salarioMaria += salarioMaria * rendimentoMaria;
            salarioJoao += salarioJoao * rendimentoJoao;
            meses++;
        }
        
        System.out.println("O salário de João ultrapassará o de Maria em " + meses + " meses.");
    }


}
