/*Crie uma classe Produto para representar um produto do mundo real, com os seguintes atributos e
métodos:
1) Campo de dados privado do tipo String chamado nome, que representará o nome do produto.
2) Campo de dados privado do tipo double chamado precoCusto.
3) Campo de dados privado do tipo double chamado precoVenda.
4) Um campo de dados privado do tipo double chamado margemLucro.
5) Métodos públicos get() e set() para os atributos acima. Modifique o método setPrecoVenda() para que
o preço de venda não seja inferior ao preço de compra. Caso isso aconteça, exiba uma mensagem
alertando o usuário.
6) Crie um método chamado calcularMargemLucro() que calculará a margem de lucro do produto.
7) Crie um método chamado getMargemLucroPorcentagem() que retornará a margem de lucro como
percentual.
Para finalizar, no método main() da classe de teste, crie um novo objeto da classe Produto, peça para o
usuário informar os preços de custo e de venda e exiba a margem de lucro em moeda e em percentual. */
package aula04.exercicio;

public class problema02 {

    public static void main(String[] args) {
        Produto produto = new Produto();

        System.out.println("Nome do produto:");
        String nome = System.console().readLine();

        System.out.println("Preço de custo:");
        double precoCusto = Double.parseDouble(System.console().readLine());

        System.out.println("Preço de venda:");
        double precoVenda = Double.parseDouble(System.console().readLine());

        produto.setNome(nome);
        produto.setPrecoCusto(precoCusto);
        produto.setPrecoVenda(precoVenda);

        double margemLucro = produto.calcularMargemLucro();

        System.out.println("Sua margem de lucro: R$" + margemLucro);

        System.out.println("Sua margem de lucro em porcentagem: " + produto.getMargemLucroPorcentagem() + "%");
    }

}

class Produto {

    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if (precoVenda < precoCusto) {
            System.out.println("Ops, não foi digitado corretamente: Preço de venda não pode ser inferior ao preço de custo.");
            return;
        }

        this.precoVenda = precoVenda;
    }

    public double calcularMargemLucro() {
        return (precoVenda - precoCusto) / precoCusto;
    }

    public double getMargemLucroPorcentagem() {
        return calcularMargemLucro() * 100;
    }

}
