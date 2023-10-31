package main.java.abra.cam.controllers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Universitario {
    private String nomeCompleto;
    private static int matricula;
    private String curso;
    private int cargaHorariaTotal;
    private int quantidadeAtividades;

    Scanner scanner = new Scanner(System.in);

    public Universitario(String nomeCompleto, int matricula, String curso) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String recuperarNomeCompleto() {
        return nomeCompleto;
    }

    public void definirNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int recuperarMatricula() {
        return matricula;
    }

    public void definirMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String recuperarCurso() {
        return curso;
    }

    public void definirCurso(String curso) {
        this.curso = curso;
    }

    public int recuperarCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public void definirCargaHorariaTotal(int cargaHorariaTotal) {
        this.cargaHorariaTotal = cargaHorariaTotal;
    }

    public int recuperarQuantidadeAtividades() {
        return quantidadeAtividades;
    }

    public void definirQuantidadeAtividades(int quantidadeAtividades) {
        this.quantidadeAtividades = quantidadeAtividades;
    }

    public static boolean salvarDadosUniversitario(ArrayList<Universitario> universitarios, Universitario universitario) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja salvar os dados do universitário? (s/n): ");
        String respostaSalvar = scanner.nextLine().trim().toLowerCase();

        if (respostaSalvar.equalsIgnoreCase("s") || respostaSalvar.equalsIgnoreCase("sim")) {
            System.out.println("Dados salvos!");
            universitarios.add(universitario);
            return true;
        } else {
            System.out.println("Dados não salvos.");
            return false;
        }
    }

    public static Universitario cadastrarUniversitario(ArrayList<Universitario> universitarios) {
        Scanner scanner = new Scanner(System.in);
        String nomeCompleto = "";
        while (true) {
            System.out.println("Informe o Nome Completo do universitário: ");
            nomeCompleto = scanner.nextLine();
            if (Pattern.matches("^[a-zA-Z ]+$", nomeCompleto)) {
                break;
            } else {
                System.out.println("Erro: O nome deve conter apenas letras. Por favor, tente novamente.");
            }
        }

        int matricula = 0;
        while (true) {
            System.out.println("Informe o Número de Matrícula do Universitário: ");
            if (scanner.hasNextInt()) {
                matricula = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Erro: A matrícula deve conter apenas números. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }

        String curso = "";
        while (true) {
            System.out.println("Informe o Curso do Universitário: ");
            curso = scanner.nextLine();
            if (Pattern.matches("^[a-zA-Z ]+$", curso)) {
                break;
            } else {
                System.out.println("Erro: O curso deve conter apenas letras. Por favor, tente novamente.");
            }
        }
        Universitario universitario = new Universitario(nomeCompleto, matricula, curso);
        boolean dadosSalvos = salvarDadosUniversitario(universitarios, universitario);
        if (dadosSalvos) {
            System.out.println("Universitário cadastrado com sucesso!");
        } else {
            System.out.println("Cadastro do universitário cancelado.");
        }

        return universitario;
    }

    public static boolean verificarMatriculaExistente(int numeroMatricula, ArrayList<Universitario> universitarios) {
        for (Universitario universitario : universitarios) {
            if (universitario.recuperarMatricula() == numeroMatricula) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarCargaHorariaTotalUniversitarios(ArrayList<Universitario> universitarios) {
        if (universitarios.isEmpty()) {
            System.out.println("Nenhum universitário está cadastrado.");
        } else {
            System.out.println("Carga horária total das atividades complementares de todos os universitários cadastrados:");
            for (Universitario universitario : universitarios) {
                System.out.println("Nome: " + universitario.recuperarNomeCompleto());
                System.out.println("Número de Matrícula: " + universitario.recuperarMatricula());
                System.out.println("Curso: " + universitario.recuperarCurso());
                System.out.println("Carga Horária Total: " + universitario.recuperarCargaHorariaTotal() + " horas");
                System.out.println("Quantidade de Atividades Complementares: " + universitario.recuperarQuantidadeAtividades());
                System.out.println("------------------------");
            }
        }
    }

    public static void mostrarCargaHorariaUniversitarioPorMatricula(ArrayList<Universitario> universitarios) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite o número de matrícula do universitário para mostrar as atividades complementares: ");
            if (scanner.hasNextInt()) {
                matricula = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println(
                        "Erro: A matrícula deve conter apenas números. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }

        boolean encontrado = false;
        for (Universitario universitario : universitarios) {
            if (universitario.recuperarMatricula() == matricula) {
                System.out.println("Nome: " + universitario.recuperarNomeCompleto());
                System.out.println("Número de Matrícula: " + universitario.recuperarMatricula());
                System.out.println("Curso: " + universitario.recuperarCurso());
                System.out.println("Carga Horária Total: " + universitario.recuperarCargaHorariaTotal() + " horas");
                System.out.println("Quantidade de Atividades Complementares: " + universitario.recuperarQuantidadeAtividades());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println(
                    "Universitário com a matrícula " + matricula + " não encontrado, ou não foi cadastrado no sistema");
        }
    }
}
