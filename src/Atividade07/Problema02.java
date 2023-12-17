package Atividade07;

/*Neste problema, implemente a classe abstrata Veículo com atributos Placa e Ano, criando os
construtores padrão e vazio e os métodos , getters/setters e a função exibir dados, que vai apresentar
um texto com os dados do veículo. Em seguida, crie uma classe Ônibus que estende Veiculo e terá o
atributo assentos, vamos criar o construtor com superclasse, getters/setters e sobreescrever o método exibirDados(), que exibirá os dados do ônibus. Depois crie a classe Caminhão que estende Veiculo e
possui atributo de eixos, vamos criar o construtor vazio, construtor com super classe, getters/setters e o
método dados para exibir os dados do Caminhão (sobreescrita do método). Para finalizar, crie uma
classe Main para testarmos as classes que criamos. Vamos criar um array de veículos, que armazenará
todos os nossos objetos Veículos e Caminhões. E, por fim, vamos criar dois laços de repetição para
exibirmos os dados dos objetos que criamos.*/

public class Problema02 {
    public static void main(String[] args) {
        Veiculo onibus = new Onibus("ABC-1234", 2015, 40);
        Veiculo caminhao = new Caminhao("DEF-5678", 2022, 4);

        Veiculo[] veiculos = { onibus, caminhao };

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }
    }
}

abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public Veiculo() {
    }

    public void exibirDados() {
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano: " + this.getAno());
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        if (placa.length() == 7) {
            this.placa = placa;
        }
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }
}

class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public Caminhao() {
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Eixos: " + this.getEixos());
    }

    public int getEixos() {
        return this.eixos;
    }

    public void setEixos(int eixos) {
        if (eixos > 0) {
            this.eixos = eixos;
        }
    }
}

class Onibus extends Veiculo{

    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public Onibus() {
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("assentos: " + this.getassentos());
    }

    public int getassentos() {
        return this.assentos;
    }

    public void setassentos(int assentos) {
        if (assentos > 0) {
            this.assentos = assentos;
        }
    }


}