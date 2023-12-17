package Atividade05;

public class VIP extends Ingresso {
    protected double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double valorIngressoVIP() {
        return valor + valorAdicional;
    }
}
