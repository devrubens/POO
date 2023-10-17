/*Escreva uma classe Círculo para representar círculos com os seguintes atributos e métodos:
a) Uma variável privada do tipo double chamada raio que guardará o valor do raio atual do circulo.
b) Métodos get() e set() públicos que permitem definir e acessar o valor da variável raio.
c) Um construtor que recebe o valor do raio como argumento.
d) Um método getArea() que calcula e retorna a área do círculo.
e) Um método getCircunferencia() que calcula e retorna a circunferência do círculo.
f) Um método aumentarRaio() que recebe um valor double e o usa como percentual para aumentar o
raio do círculo.
Crie um programa principal para testar as funcionalidades da classe Circulo.. */

package aula04.exercicio;

public class problema01 {
    
    public static void main(String[] args) {
        
        
        Circulo circulo = new Circulo(5);
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Circunferencia: " + circulo.getCircunferencia());
        circulo.aumentarRaio(10);
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Circunferencia: " + circulo.getCircunferencia());

    }

}


class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * this.raio;
    }

    public void aumentarRaio(double percentual) {
        this.raio = this.raio + (this.raio * (percentual / 100));
    }

}


