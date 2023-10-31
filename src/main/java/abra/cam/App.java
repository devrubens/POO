package main.java.abra.cam;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.abra.cam.controllers.AtividadeExtraCurricular;
import main.java.abra.cam.controllers.Universitario;

public class App {
    public static void main(String[] args) {

        ArrayList<Universitario> universitarios = new ArrayList<>();
        ArrayList<AtividadeExtraCurricular> atividades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("_________________________________________________________________________");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Atividade");
            System.out.println("3. Visualizar atividades a partir da matrícula");
            System.out.println("4. Alterar status de aproveitamento da atividade");
            System.out.println("5. Mostrar carga horária total das atividades complementares dos alunos");
            System.out.println("6. Mostrar carga horária total das atividades complementares de um aluno");
            System.out.println("7. Sair");
            System.out.println("_________________________________________________________________________");

            if (scanner.hasNextInt()) {
                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        Universitario universitario = Universitario.cadastrarUniversitario(universitarios);
                        break;
                    case 2:
                        AtividadeExtraCurricular atividade = AtividadeExtraCurricular.cadastrarAtividade(atividades);
                        break;
                    case 3:
                        AtividadeExtraCurricular.exibirAtividades(atividades);
                        break;
                    case 4:
                        AtividadeExtraCurricular.alterarStatusAproveitamento(atividades, atividades);
                        break;
                    case 5:
                        Universitario.mostrarCargaHorariaTotalUniversitarios(universitarios);
                        break;
                    case 6:
                        Universitario.mostrarCargaHorariaTotalUniversitarios(universitarios);
                        break;
                    case 7:
                        System.out.println(
                                "Obrigado por usar o sistema de gestão das atividades complementares. Tchau tchau!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            } else {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
                scanner.nextLine();
            }
        }
    }
}
