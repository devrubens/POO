package Atividade06;

class Administrativo extends Assistente {
    private String turno;
    private float adicionalNoturno;

    public Administrativo(String nome, float salario, int numeroMatricula, String turno, float adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + this.adicionalNoturno;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Número de matrícula: " + this.getNumeroMatricula());
        System.out.println("Turno: " + this.getTurno());
        System.out.println("Adicional noturno: " + this.getAdicionalNoturno());
        System.out.println("Ganho anual: " + this.ganhoAnual());
    }
}