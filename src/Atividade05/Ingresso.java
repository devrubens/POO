package Atividade05;


public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: " + valor);
    }
}