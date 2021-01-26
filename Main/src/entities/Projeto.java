package entities;

import java.util.Date;

public class Projeto {

  private String titulo;
  private String objetivo;
  private String descricao;
  private String agenciaFinanciadora;
  private double valorDoFinanciamento;
  private int status;
  private Date dataInicio;
  private Date dataTermino;

  Projeto(String titulo, String objetivo, String descricao, String agenciaFinanciadora, double valorDoFinanciamento, int status, Date dataInicio, Date dataTermino) {
  

    this.titulo = titulo; 
    this.objetivo = objetivo; 
    this.descricao = descricao; 
    this.agenciaFinanciadora = agenciaFinanciadora; 
    this.valorDoFinanciamento = valorDoFinanciamento; 
    this.status = status; 
    this.dataInicio = dataInicio; 
    this.dataTermino = dataTermino; 
  }
  
  public static ProjetoBuilder builder(){
    return new ProjetoBuilder();
  }  
  public static class ProjetoBuilder {
    
    private String titulo;
    private String objetivo;
    private String descricao;
    private String agenciaFinanciadora;
    private double valorDoFinanciamento;
    private int status;
    private Date dataInicio;
    private Date dataTermino;

    ProjetoBuilder() {    
    }
      
    public ProjetoBuilder titulo(String titulo){
      this.titulo = titulo;
      return ProjetoBuilder.this;
    }

    public ProjetoBuilder objetivo(String objetivo){
      this.objetivo = objetivo;
      return ProjetoBuilder.this;
    }

    public ProjetoBuilder descricao(String descricao){
      this.descricao = descricao;
      return ProjetoBuilder.this;
    }

    public ProjetoBuilder agenciaFinanciadora(String agenciaFinanciadora){
      this.agenciaFinanciadora = agenciaFinanciadora;
      return ProjetoBuilder.this;
    }

    public ProjetoBuilder valorDoFinanciamento(double valorDoFinanciamento){
      this.valorDoFinanciamento = valorDoFinanciamento;
      return ProjetoBuilder.this;
    }

    public ProjetoBuilder status(int status){
      this.status = status;
      return ProjetoBuilder.this;
    }

    public ProjetoBuilder dataInicio(Date dataInicio){
      this.dataInicio = dataInicio;
      return ProjetoBuilder.this;
    }

    public ProjetoBuilder dataTermino(Date dataTermino){
      this.dataTermino = dataTermino;
      return ProjetoBuilder.this;
    }

    public Projeto build() {
      return new Projeto(this.titulo, this.objetivo, this.descricao, this.agenciaFinanciadora, this.valorDoFinanciamento, this.status, this.dataInicio, this.dataTermino);
    }
    @Override
    public String toString() {
      return "Projeto.ProjetoBuilder(titulo=" + this.titulo + ", objetivo=" + this.objetivo + ", descricao=" + this.descricao + ", agenciaFinanciadora=" + this.agenciaFinanciadora + ", valorDoFinanciamento=" + this.valorDoFinanciamento + ", status=" + this.status + ", dataInicio=" + this.dataInicio + ", dataTermino=" + this.dataTermino + ")";
    }
  }
  
  @Override
  public String toString() {
    return "\nProjeto:\n * Título: " + this.titulo + "\n * Objetivo: " + this.objetivo + "\n * Descrição: " + this.descricao + "\n * Agência Financiadora: " + this.agenciaFinanciadora + "\n * Valor do Financiamento: " + this.valorDoFinanciamento + "\n * Status: " + this.status + "\n * Data de Início: " + this.dataInicio + "\n * Data de Término: " + this.dataTermino + "\n---------------------------\n";
  }
  
}
