package Atividade05;

/*Neste problema, Crie uma classe chamada Ingresso que possui um valor em reais e um método
imprimeValor().

a) Crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um método que retorne
o valor do ingresso VIP (com o adicional incluído).

b) Crie uma classe Normal, que herda Ingresso e possui um método que imprime: "Ingresso
Normal".

c) Crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos para acessar e
imprimir esta localização) e uma classe CamaroteSuperior, que é mais cara (possui valor
adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as classes
herdam a classe VIP. */


public class problema02 {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(100f);
        VIP vip = new VIP(ingresso, 50f);
        Normal normal = new Normal(ingresso);
        CamaroteInferior camaroteInferior = new CamaroteInferior(vip, "A1");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50f);

        System.out.println("Ingresso: " + ingresso.imprimeValor());
        System.out.println("Ingresso VIP: " + vip.imprimeValor());
        System.out.println("Ingresso Normal: " + normal.imprimeValor());
        System.out.println("Ingresso Camarote Inferior: " + camaroteInferior.imprimeValor());
        System.out.println("Ingresso Camarote Superior: " + camaroteSuperior.imprimeValor());
    }
}


