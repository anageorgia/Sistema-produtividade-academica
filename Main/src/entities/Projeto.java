package entities;

import java.util.Scanner;

public class Projeto {
    
    String titulo;
    String dataInicio;
    String dataTermino;
    String objetivo;
    String descricao;
    String agenciaFinanciadora;
    double valorDoFinanciamento;
    int status;


    public Projeto(String titulo, String dataInicio, String dataTermino, 
                String objetivo, String descricao, String agenciaFinanciadora,
                double valorDoFinanciamento){
        
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.objetivo = objetivo;
        this.descricao = descricao;
        this.agenciaFinanciadora = agenciaFinanciadora;
        this.valorDoFinanciamento = valorDoFinanciamento;    
    }

    
    public void alterarStatus(){
        Scanner sc = new Scanner(System.in);
        char resposta;

        // -1: Em elaboração
        //  1: Em andamento
        //  0: Concluído

        if(this.getStatus() == -1){
            System.out.println("Alterar status para \"Em andamento\" (s/n)?");
            resposta = sc.next().charAt(0);

            if(resposta == 's'){
                this.setStatus(1);
            }
        }
        else if(this.getStatus() == 1){
            System.out.println("Alterar status para \"Concluído\" (s/n)?");
            resposta = sc.next().charAt(0);

            if(resposta == 's'){
                this.setStatus(0);
            }
        }
        else if (this.getStatus() == 0) {
            System.out.println("Projeto concluído, não dá mais para modificar!");
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAgenciaFinanciadora() {
        return agenciaFinanciadora;
    }

    public double getValorDoFinanciamento() {
        return valorDoFinanciamento;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
