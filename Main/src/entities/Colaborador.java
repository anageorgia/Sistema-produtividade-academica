package entities;

public class Colaborador {
    private String nome;
    private String email;
    private int categoria;

    public Colaborador(String nome, String email, int categoria){
        this.nome = nome;
        this.email = email;
        this.categoria = categoria;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public int getCategoria() {
       return categoria;       
    }


}
