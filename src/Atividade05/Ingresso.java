package Atividade05;


public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public String imprimeValor() {
        return "Valor do ingresso: " + valor;
    }
}