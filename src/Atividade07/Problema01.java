package Atividade07;

/*Neste problema, implemente a classe abstrata Figura com o atributo string cor e os métodos
setCor(String cor) e getCor(). Em seguida, crie a classe Retângulo que vai estender a classe Figura e
declarar dois atributos nela como double (lado1 e lado2). Vamos também criar o construtor padrão, os
getters/setters, o métodos toString (para retornar um texto) e um método chamado double área(), onde
colocaremos um return com a função lado 1 * lado 2, para obtermos a área. Depois, crie uma classe
Triângulo que vai estender a classe Figura com os atributos base e altura, criar o construtor padrão,
getters/setters, método toString e médoto double área que retorna base * altura. Crie um crie uma
classe Círculo que vai estender a classe Figura com os atributos raio, criar o construtor padrão,
getters/setters, método toString e o método getDiametro() que retorna a fórmula raio * 3.14 (valor de Pi)
* 2. Por fim, crie uma classe Quadrado que vai estender a classe Retângulo com um construtor super (de
Retangulo) e o médoto toString. Para finalizar, vamos criar uma classe chamado Teste para criarmos os
objetos de todas as classes que criamos e ver o resultado */


public class Problema01 {
    public static void main(String[] args) {
        Figura retangulo = new Retangulo("Azul", 10, 20);
        Figura triangulo = new Triangulo("Vermelho", 10, 20);
        Figura circulo = new Circulo("Verde", 10);
        Figura quadrado = new Quadrado("Amarelo", 10);

        System.out.println(retangulo);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(quadrado);
    }
} 

abstract class Figura {
    private String cor;

    public Figura(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    public Retangulo(String cor, double lado1, double lado2) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double area() {
        return this.lado1 * this.lado2;
    }

    @Override
    public String toString() {
        return "Retângulo: " + this.getCor() + ", " + this.lado1 + ", " + this.lado2 + ", " + this.area();
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "Triângulo: " + this.getCor() + ", " + this.base + ", " + this.altura + ", " + this.area();
    }
}

class Circulo extends Figura {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return this.raio * 3.14 * 2;
    }

    @Override
    public String toString() {
        return "Círculo: " + this.getCor() + ", " + this.raio + ", " + this.getDiametro();
    }
}

class Quadrado extends Retangulo {
    public Quadrado(String cor, double lado) {
        super(cor, lado, lado);
    }

    @Override
    public String toString() {
        return "Quadrado: " + this.getCor() + ", " + this.getLado1() + ", " + this.getLado2() + ", " + this.area();
    }
}


