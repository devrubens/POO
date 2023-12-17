package Atividade07;

/*Neste problema, vamos utilizar o conceito de interface para implementar alguns métodos padrões.
Considere que iremos implementar o sistema de um banco e que este possui vários tipos de conta. Além
disso, sabemos que cada conta pode ter tributações diferentes. Para isso, vamos criar uma interface
para o calculo dos tributos. Crie uma classe abstrata conta que com o atributo saldo e com os métodos deposita(double valor),
getSaldo(), saca(double valor) e setSaldo(double saldo). Depois crie as classes contaCorrente,
contaPoupança e seguroDeVida, que implementam a interface Tributavel considerando que a
contaPoupança não é tributável, que a classe contaCorrente é tributável em 3% e que a classe
seguroDeVida é tributável com taxa fixa de 35 reais.*/


public class Problema03 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(2500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(100);
        SeguroDeVida seguroDeVida = new SeguroDeVida(500);

        System.out.println(contaCorrente.calculaTributos());
        System.out.println(contaPoupanca.calculaTributos());
        System.out.println(seguroDeVida.calculaTributos());
    }
}

abstract class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void saca(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }
}

class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.03;
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    
    public double calculaTributos() {
        return 0;
    }
}

class SeguroDeVida extends Conta implements Tributavel {
    public SeguroDeVida(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos() {
        return 35;
        
    }
}

interface Tributavel {
    public double calculaTributos();
}


