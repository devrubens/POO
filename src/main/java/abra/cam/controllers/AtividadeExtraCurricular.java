package main.java.abra.cam.controllers;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeExtraCurricular {
    private String nomeAtividadeExtraCurricular;
    private int matriculaAtividadeExtraCurricular;
    private static int contadorNumeroRegistro = 1;
    private int numeroRegistro;
    private int grupoAtividade;
    private String descricaoAtividade;
    private boolean statusAproveitamento;
    private int cargaHorariaConsiderada;

    public AtividadeExtraCurricular(String nomeAtividadeExtraCurricular, int matriculaAtividadeExtraCurricular,
            int grupoAtividade,
            String descricaoAtividade) {
        this.nomeAtividadeExtraCurricular = nomeAtividadeExtraCurricular;
        this.matriculaAtividadeExtraCurricular = matriculaAtividadeExtraCurricular;
        this.grupoAtividade = grupoAtividade;
        this.descricaoAtividade = descricaoAtividade;
        this.statusAproveitamento = false;
        this.cargaHorariaConsiderada = 0;
        this.numeroRegistro = contadorNumeroRegistro;
        contadorNumeroRegistro++;
    }

    public static boolean salvarAtividade(ArrayList<AtividadeExtraCurricular> atividades,
            AtividadeExtraCurricular atividade) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja salvar as informações da atividade? (s/n): ");
        String respostaSalvar = scanner.nextLine().trim().toLowerCase();

        if (respostaSalvar.equalsIgnoreCase("s") || respostaSalvar.equalsIgnoreCase("sim")) {
            System.out.println("Informações salvas!");
            atividades.add(atividade);
            return true;
        } else {
            System.out.println("Informações não salvas.");
            return false;
        }
    }

    public static AtividadeExtraCurricular cadastrarAtividade(ArrayList<AtividadeExtraCurricular> atividades) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da atividade extra curricular: ");
        String nomeAtividadeExtraCurricular = scanner.nextLine();

        int matriculaAtividadeExtraCurricular = 0;
        while (true) {
            System.out.print("Digite a matrícula do aluno: ");
            if (scanner.hasNextInt()) {
                matriculaAtividadeExtraCurricular = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Erro: A matrícula deve conter apenas números. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }

        int grupoAtividade = 0;
        while (true) {
            System.out.print("Digite o grupo da atividade: ");
            if (scanner.hasNextInt()) {
                grupoAtividade = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println(
                        "Erro: O grupo de atividade deve conter apenas números. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }

        System.out.print("Digite a descrição da atividade: ");
        String descricaoAtividade = scanner.nextLine();

        AtividadeExtraCurricular atividade = new AtividadeExtraCurricular(nomeAtividadeExtraCurricular,
                matriculaAtividadeExtraCurricular,
                grupoAtividade, descricaoAtividade);
        boolean dadosSalvos = salvarAtividade(atividades, atividade);
        if (dadosSalvos) {
            System.out.println("Atividade extra curricular cadastrada com sucesso! Número de registro da atividade é "
                    + atividade.getNumeroRegistro());
        } else {
            System.out.println("Cadastro da atividade extra curricular cancelado.");
        }

        return atividade;
    }

    public static void exibirAtividades(ArrayList<AtividadeExtraCurricular> atividades) {
        for (AtividadeExtraCurricular atividade : atividades) {
            atividade.exibirAtividadeCurricular();
        }
    }

    public void exibirAtividadeCurricular() {
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Nome da Atividade Curricular: " + nomeAtividadeExtraCurricular);
        System.out.println("Matrícula: " + matriculaAtividadeExtraCurricular);
        System.out.println("Grupo da Atividade: " + grupoAtividade);
        System.out.println("Descrição da Atividade: " + descricaoAtividade);
        System.out.println("Status de Aproveitamento: " + statusAproveitamento);
        System.out.println("Carga Horária Considerada: " + cargaHorariaConsiderada + " horas\n");
    }

    public static void alterarStatusAproveitamento(ArrayList<AtividadeExtraCurricular> atividades,
            ArrayList<AtividadeExtraCurricular> atividadesAprovadas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de registro da atividade que deseja alterar o status de aproveitamento: ");
        int numeroRegistro = scanner.nextInt();
        scanner.nextLine();

        boolean encontrou = false;
        for (AtividadeExtraCurricular atividade : atividades) {
            if (atividade.getNumeroRegistro() == numeroRegistro) {
                encontrou = true;
                if (atividade.isStatusAproveitamento()) {
                    System.out.println("Atenção: Esta atividade já foi aprovada anteriormente.");
                    return;
                } else {
                    System.out.print("Digite o novo status de aproveitamento (true ou false): ");
                    boolean novoStatusAproveitamento = scanner.nextBoolean();
                    scanner.nextLine();
                    atividade.setStatusAproveitamento(novoStatusAproveitamento);

                    if (novoStatusAproveitamento) {
                        System.out.print("Digite a carga horária considerada para esta atividade: ");
                        int cargaHoraria = scanner.nextInt();
                        scanner.nextLine();
                        atividade.setCargaHorariaConsiderada(cargaHoraria);
                        atividadesAprovadas.add(atividade);
                        System.out.println("Atividade aprovada com sucesso!");
                    } else {
                        System.out.println("Atividade reprovada.");
                    }
                    break;
                }
            }
        }

        if (!encontrou) {
            System.out.println("Atividade com o número de registro " + numeroRegistro + " não encontrada.");
        }
    }

    public String getNomeAtividadeExtraCurricular() {
        return nomeAtividadeExtraCurricular;
    }

    public void setNomeAtividadeExtraCurricular(String nomeAtividadeExtraCurricular) {
        this.nomeAtividadeExtraCurricular = nomeAtividadeExtraCurricular;
    }

    public int getMatriculaAtividadeExtraCurricular() {
        return matriculaAtividadeExtraCurricular;
    }

    public void setMatriculaAtividadeExtraCurricular(int matriculaAtividadeExtraCurricular) {
        this.matriculaAtividadeExtraCurricular = matriculaAtividadeExtraCurricular;
    }

    public static int getContadorNumeroRegistro() {
        return contadorNumeroRegistro;
    }

    public static void setContadorNumeroRegistro(int contadorNumeroRegistro) {
        AtividadeExtraCurricular.contadorNumeroRegistro = contadorNumeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public int getGrupoAtividade() {
        return grupoAtividade;
    }

    public void setGrupoAtividade(int grupoAtividade) {
        this.grupoAtividade = grupoAtividade;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }

    public boolean isStatusAproveitamento() {
        return statusAproveitamento;
    }

    public void setStatusAproveitamento(boolean statusAproveitamento) {
        this.statusAproveitamento = statusAproveitamento;
    }

    public int getCargaHorariaConsiderada() {
        return cargaHorariaConsiderada;
    }

    public void setCargaHorariaConsiderada(int cargaHorariaConsiderada) {
        this.cargaHorariaConsiderada = cargaHorariaConsiderada;
    }
}
