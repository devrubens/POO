package Atividade06;

class Tecnico extends Assistente {
    private float bonusSalarial;

    public Tecnico(String nome, float salario, int numeroMatricula, float bonusSalarial) {
        super(nome, salario, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + this.bonusSalarial;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Número de matrícula: " + this.getNumeroMatricula());
        System.out.println("Bônus salarial: " + this.getBonusSalarial());
        System.out.println("Ganho anual: " + this.ganhoAnual());
    }
}
