package Atividade06;

/*Neste problema você irá implementar o sistema de uma loja de produtos de informática. Para isso, crie
uma classe “Produto” que possua os atributos “nomeloja” e “preco”, crie os métodos sets e gets para
estes atributos. Crie também o atributo “descrição” e seu método chamado “getDescrição” que retorna
uma string com o simples conteúdo “Produto de informática”. Em seguida, crie duas classes filhas de
“Produto”, que serão “Mouse” com o atributo “tipo” e “Livro” com o atributo “autor”, no método
construtor de cada uma dessas classes passe como argumento a descrição desse produto, por exemplo,
Mouse(“Mouse ótico, Saída USB. 1.600 dpi”), e utilizando o conceito de polimorfismo crie o método
“getDescrição” que retorna a descrição que foi passada no argumento do construtor concatenada com o
atributo que a classe tiver, “autor” no caso de livro e “tipo” no caso de mouse, esse método deve ter a
mesma assinatura do método “getDescrição” da classe pai “Produto”. Por fim, faça o programa principal
que irá simular a compra de um cliente de vários mouses e livros, deve haver apenas um vector/arraylist
na classe “Main” para armazenamento de todos os livros e mouses. Esse vector/arraylist deve se chamar
“carrinho” que simula o carrinho de compras de produtos variados de um cliente em um e-commerce.
Insira nesse “carrinho” vários mouses e livros e depois chame o método “getDescrição” de todos os
objetos presentes no vector/arraylist. Para o usuário do carrinho saber as informações dos produtos em
seu carrinho. */


public class Problema02 {
    public static void main(String[] args) {
        Produto mouse = new Mouse("Mouse ótico, Saída USB. 1.600 dpi", "Ótico");
        Produto livro = new Livro("Livro de Java", "João da Silva");

        System.out.println(mouse.getDescricao());
        System.out.println(livro.getDescricao());
    }
}

class Produto {
    private String nomeLoja;
    private double preco;
    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
}

class Mouse extends Produto {
    private String tipo;

    public Mouse(String descricao, String tipo) {
        super(descricao);
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " " + this.tipo;
    }
}

class Livro extends Produto {
    private String autor;

    public Livro(String descricao, String autor) {
        super(descricao);
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " " + this.autor;
    }
}


