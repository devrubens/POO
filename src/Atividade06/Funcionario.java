package Atividade06;

class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void aumentoSalarial(double valor) {
        this.salario += valor;
    }

    public double ganhoAnual() {
        return this.salario * 12;
    }

    public void exibeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Ganho anual: " + this.ganhoAnual());
    }
}