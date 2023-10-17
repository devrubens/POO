/*Escreva um programa para controle de empréstimo de livros em um sistema de biblioteca. Para isso é
necessário criar três classes (Empréstimo, Livro e Pessoa). A classe Pessoa serve para cadastrar os dados
de uma pessoa que queira realizar o empréstimo de uma livro na biblioteca, com os seguintes dados:
Nome completo, CPF, e-mail, endereço e telefone. A classe Livro serve para cadastrar os livros
disponíveis no acervo da biblioteca e deve conter os seguintes dados: Título do livro, Autores, Ano,
Edição e Editora. Por fim, a classe Empréstimo serve para registrar os dados de um empréstimo
contendo a pessoa e o livro. Neste programa crie as classes com seus métodos e atributos e faça um
programa principal que permita ao usuário selecionar cadastrar pessoa, cadastrar livro e realizar
empréstimo. */

package aula04.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String endereco;
    private String telefone;

    public Pessoa(String nomeCompleto, String cpf, String email, String endereco, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class Livro {
    private String titulo;
    private String autores;
    private int ano;
    private int edicao;
    private String editora;

    public Livro(String titulo, String autores, int ano, int edicao, String editora) {
        this.titulo = titulo;
        this.autores = autores;
        this.ano = ano;
        this.edicao = edicao;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}

class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;

    public Emprestimo(Pessoa pessoa, Livro livro) {
        this.pessoa = pessoa;
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}

public class problema03 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();
        List<Emprestimo> emprestimos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo a Biblioteca Caiu do Caminhão!");
            System.out.println("Selecione uma opção válida:");
            System.out.println("1. Cadastrar Pessoa: ");
            System.out.println("2. Cadastrar Livro: ");
            System.out.println("3. Realizar Empréstimo: ");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Cadastro de Pessoa: ");
                System.out.print("Nome Completo: ");
                scanner.nextLine();
                String nomeCompleto = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.next();
                System.out.print("E-mail: ");
                String email = scanner.next();
                System.out.print("Endereço: ");
                scanner.nextLine();
                String endereco = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.next();

                Pessoa pessoa = new Pessoa(nomeCompleto, cpf, email, endereco, telefone);
                pessoas.add(pessoa);
                System.out.println("Pessoa cadastrada com sucesso. Parabeéns!");
            } else if (opcao == 2) {
                System.out.println("Cadastro de Livro:");
                System.out.print("Título: ");
                scanner.nextLine();
                String titulo = scanner.nextLine();
                System.out.print("Autores: ");
                String autores = scanner.nextLine();
                System.out.print("Ano: ");
                int ano = scanner.nextInt();
                System.out.print("Edição: ");
                int edicao = scanner.nextInt();
                System.out.print("Editora: ");
                scanner.nextLine();
                String editora = scanner.nextLine();

                Livro livro = new Livro(titulo, autores, ano, edicao, editora);
                livros.add(livro);
                System.out.println("Livro cadastrado com sucesso.");
            } else if (opcao == 3) {
                System.out.println("Realizar Empréstimo:");
                System.out.print("Selecione a Pessoa (Digite o número da Pessoa):");
                for (int i = 0; i < pessoas.size(); i++) {
                    System.out.println((i + 1) + ". " + pessoas.get(i).getNomeCompleto());
                }
                int pessoaSelecionada = scanner.nextInt();
                Pessoa pessoa = pessoas.get(pessoaSelecionada - 1);

                System.out.print("Selecione o Livro (Digite o número do Livro):");
                for (int i = 0; i < livros.size(); i++) {
                    System.out.println((i + 1) + ". " + livros.get(i).getTitulo());
                }
                int livroSelecionado = scanner.nextInt();
                Livro livro = livros.get(livroSelecionado - 1);

                Emprestimo emprestimo = new Emprestimo(pessoa, livro);
                emprestimos.add(emprestimo);
                System.out.println("Empréstimo realizado com sucesso.");
            } else if (opcao == 4) {
                break;
            }
        }

        System.out.println("Já vai, volte sempre que precisar de livros direto de caminhões tombados. Tchau!");
    }
}
