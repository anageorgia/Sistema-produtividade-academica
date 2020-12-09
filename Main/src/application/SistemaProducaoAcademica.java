package application;

import java.util.Scanner;

import entities.Laboratorio;


public class SistemaProducaoAcademica {
    private static Scanner sc;

    public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        Laboratorio laboratorio = new Laboratorio();
        
        int opcao = 1;

        System.out.println("\n\nBem-vindo ao Sistema de Produtividade Acadêmica! O que você deseja fazer? \n");

        while(opcao > 0 && opcao < 8){
            System.out.println();

            System.out.println("---------------- MENU -----------------\n" +
                    "|                                     |\n" +
                    "|  1 - Adicionar um novo projeto      |\n" +
                    "|  2 - Adicionar um novo colaborador  |\n" +
                    "|  3 - Adicionar uma nova publicação  |\n" + 
                    "|  4 - Alterar status de um projeto   |\n" +
                    "|  5 - Listar projetos                |\n" +
                    "|  6 - Listar colaboradores           |\n" +
                    "|  7 - Consultar colaborador          |\n" +
                    "|  8 - Sair                           |\n" +
                    "|                                     |\n" +
                    "---------------------------------------\n");

            System.out.print("Digite o número da opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    laboratorio.adicionarProjeto();
                    break;
                case 2:
                    laboratorio.adicionarColaborador();
                    break;
                case 3:
                    System.out.println("\n--> Opção 3 ainda em construção");
                    break;
                case 4:
                    System.out.println("\n--> Opção 4 ainda em construção");
                    break;
                case 5:
                    laboratorio.listarProjetos();
                    break;
                case 6:
                    laboratorio.listarColaboradores();
                    break;
                case 7:
                    System.out.print("\nDigite o nome do colaborador que deseja consultar os dados: ");
                    String nome = sc.nextLine();
                    laboratorio.consultarColaborador(nome);
                    break;
                case 8:
                    System.out.println("\n\nAté mais!\n\n");
                    break;
                default:
                    System.out.println();
                    System.out.println("\n---------------------------------------");
                    System.out.println("\n             Opção inválida!           ");
                    System.out.println("\n---------------------------------------");
                    break;
            }
        
        }
    }
}
