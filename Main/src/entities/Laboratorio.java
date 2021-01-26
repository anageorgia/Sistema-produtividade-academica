package entities;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Projeto.ProjetoBuilder;

import java.util.Date;

public class Laboratorio {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private static ArrayList<Colaborador> listaColaboradores = new ArrayList<Colaborador>();
    private static ArrayList<Projeto> listaProjetos = new ArrayList<Projeto>();

    public void adicionarColaborador() {
        System.out.println("\nDigite os dados do colaborador:");

        System.out.print("\nNome: ");
        String nome = sc.nextLine();

        System.out.print("\nE-mail: ");
        String email = sc.nextLine();

        System.out.println("A qual categoria este colaborador pertence? \n" + "1 - Aluno Graduação\n"
                + "2 - Aluno Mestrado\n" + "3 - Aluno Doutorado\n" + "4 - Professor\n" + "5 - Pesquisador\n");

        int opcaoCategoria = sc.nextInt();
        sc.nextLine(); // escape do enter

        if (opcaoCategoria > 5 || opcaoCategoria < 1) {
            System.out.println("Categoria inválida!");
            return;
        }

        Colaborador novoColaborador = new Colaborador(nome, email, opcaoCategoria);

        Laboratorio.getListaColaboradores().add(novoColaborador);

    }

    public void listarColaboradores() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("        Colaboradores cadastrados        ");
        System.out.println("-----------------------------------------");

        if (Laboratorio.getListaColaboradores().isEmpty()) {
            System.out.println("Não há nenhum colaborador cadastrado.");
        } else {
            for (Colaborador c : Laboratorio.getListaColaboradores()) {
                System.out.printf("\nNome: %s\nE-mail: %s\nCategoria: %s%n", c.getNome(), c.getEmail(),
                        c.getCategoria());

            }
        }

        System.out.println();

    }

    public Colaborador consultarColaborador(String nome) {
        System.out.println();

        System.out.println("\nAqui estão os colaboradores que contém o nome buscado: ");

        for (Colaborador colaboradorBuscado : Laboratorio.getListaColaboradores()) {

            if (colaboradorBuscado.getNome().contains(nome)) {

                System.out.printf("\nNome: %s\nE-mail: %s\nCategoria: %s%n", colaboradorBuscado.getNome(),
                        colaboradorBuscado.getEmail(), colaboradorBuscado.getCategoria());

            }
        }

        return null;
    }

    public void adicionarProjeto() {

        try {
            System.out.println("\nDigite os dados do projeto:\n");

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Objetivo: ");
            String objetivo = sc.nextLine();

            System.out.print("Descrição: ");
            String descricao = sc.nextLine();

            System.out.print("Agência financiadora: ");
            String agenciaFinanciadora = sc.nextLine();

            System.out.print("Valor do financiamento: ");
            double valorDoFinanciamento = sc.nextDouble();

            System.out.print("Data de início no formato dd/mm/aaaa: ");
            Date dataInicio = sdf.parse(sc.next());

            System.out.print("Data de término no formato dd/mm/aaaa: ");
            Date dataTermino = sdf.parse(sc.next());


            Projeto novoProjeto = new ProjetoBuilder().titulo(titulo)
                    .objetivo(objetivo).descricao(descricao).agenciaFinanciadora(agenciaFinanciadora)
                    .valorDoFinanciamento(valorDoFinanciamento).dataInicio(dataInicio).dataTermino(dataTermino).build();
            

            Laboratorio.getListaProjetos().add(novoProjeto);
        }
        catch (ParseException e) {
			System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println("         Formato de data inválido        ");
            System.out.println("-----------------------------------------");
            System.out.println();
		}

		catch (RuntimeException e) {
            System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println("               Erro inesperado           ");
            System.out.println("-----------------------------------------");
            System.out.println();
		}
    }


    public void listarProjetos(){
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("           Projetos cadastrados          ");
        System.out.println("-----------------------------------------");

        if(Laboratorio.getListaProjetos().isEmpty()){
            System.out.println("Não há nenhum projeto cadastrado.");
        }
        else {
            for (Projeto proj : Laboratorio.getListaProjetos()) {

                System.out.println(proj);
                System.out.println();
    
            }
        }

    }


    public static ArrayList<Colaborador> getListaColaboradores(){
        return listaColaboradores;
    }

    public static ArrayList<Projeto> getListaProjetos(){
        return listaProjetos;
    }

    
}
