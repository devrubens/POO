package Atividade05;

public class CamaroteSuperior extends VIP {
    private double valorAdicional;

    public CamaroteSuperior(double valorAdicional) {
        super(valorAdicional);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double valorIngresso() {
        return valor + valorAdicional + super.valorAdicional;
    }
}
