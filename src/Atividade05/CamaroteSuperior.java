package Atividade05;

public class CamaroteSuperior extends VIP {
    private double valorAdicional;

    public CamaroteSuperior(double valorAdicional) {
        super(valorAdicional, valorAdicional);
        this.valorAdicional = valorAdicional;
    }

    
    public double valorIngresso() {
        return valor + valorAdicional + super.valorAdicional;
    }
}
