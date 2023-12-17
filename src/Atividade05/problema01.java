/*Neste problema, crie uma classe Animal que obedeça à seguinte descrição: possua os atributos nome
(String), comprimento (float), número de patas (int), cor (String), ambiente (String) e velocidade média
(float) . Em seguida, crie um método construtor que receba por parâmetro os valores iniciais de cada
um dos atributos e atribua-os aos seus respectivos atributos. Além disso, crie os métodos get e set para
cada um dos atributos. Por fim, crie um método dados, sem parâmetro e do tipo void, que, quando
chamado, imprime na tela uma espécie de relatório informando os dados do animal.
Agora, crie uma classe Peixe que herde da classe Animal e obedeça à seguinte descrição: possua um
atributo caracteristica(String). Em seguida, crie um método construtor que receba por parâmetro os
valores iniciais de cada um dos atributos (incluindo os atributos da classe Animal) e atribua-os aos seus
respectivos atributos. Também crie ainda os métodos get e set para o atributo caracteristica. Crie um
método dadosPeixe sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie
de relatório informando os dados do peixe (incluindo os dados do Animal e mais a característica).
Em seguida, crie uma classe Mamifero que herde da classe Animal e obedeça à seguinte descrição:
possua um atributo alimento(String) Crie um método construtor que receba por parâmetro os valores
iniciais de cada um dos atributos (incluindo os atributos da classe Animal) e atribua-os aos seus
respectivos atributos. Crie ainda os métodos get e set para o atributo alimento. Crie um método
dadosMamifero sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie de
relatório informando os dados do mamifero (incluindo os dados do Animal e mais o alimento).
Por fim, altere as classes criadas anteriormente, de modo que o método dados da classe Animal seja
sobrescrito nas subclasses. Em seguida, uma classe TestarAnimais possua um método main para testar
as classes criadas.*/

package Atividade05;

public class problema01 {
    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", 1.5f, 4, "Marrom", "Terra", 20f);
        Peixe peixe = new Peixe("Tubarão", 3.5f, 0, "Cinza", "Mar", 50f, "Barbatanas e cauda");
        Mamifero mamifero = new Mamifero("Gato", 1.2f, 4, "Branco", "Terra", 15f, "Ração");

        animal.dados();
        peixe.dados();
        mamifero.dados();
    }
}

class Animal {
    private String nome;
    private float comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public void dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Número de patas: " + this.numeroPatas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Velocidade média: " + this.velocidadeMedia);
    }

    public String getNome() {
        return this.nome;
    }

    public float getComprimento() {
        return this.comprimento;
    }

    public int getNumeroPatas() {
        return this.numeroPatas;
    }

    public String getCor() {
        return this.cor;
    }

    public String getAmbiente() {
        return this.ambiente;
    }

    public float getVelocidadeMedia() {
        return this.velocidadeMedia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}

class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public void dados() {
        super.dados();
        System.out.println("Característica: " + this.caracteristica);
    }

    public String getCaracteristica() {
        return this.caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}

class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public void dados() {
        super.dados();
        System.out.println("Alimento: " + this.alimento);
    }

    public String getAlimento() {
        return this.alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}

