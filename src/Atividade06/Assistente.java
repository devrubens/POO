package Atividade06;

class Assistente extends Funcionario {
    private int numeroMatricula;

    public Assistente(String nome, float salario, int numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Número de matrícula: " + this.getNumeroMatricula());
        System.out.println("Ganho anual: " + this.ganhoAnual());
    }
}
