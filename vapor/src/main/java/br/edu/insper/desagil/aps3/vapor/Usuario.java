package br.edu.insper.desagil.aps3.vapor;

public class Usuario {
    private String apelido;
    private String nome;

    public String getApelido() {
        return apelido;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public Usuario(String apelido, String nome){
        this.apelido = apelido;
        this.nome = nome;
    }

}
