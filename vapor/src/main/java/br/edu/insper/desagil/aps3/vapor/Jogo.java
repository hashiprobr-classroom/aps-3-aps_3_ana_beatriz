package br.edu.insper.desagil.aps3.vapor;

import java.util.HashMap;
import java.util.Map;

public class Jogo {
    private int id;
    private String nome;
    private Map<String, Integer> avaliacoes = new HashMap<>();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Jogo(int id, String nome){
        this.id = id;
        this.nome = nome;
        avaliacoes = new HashMap<>();
    }

    public void avalia(String apelido, int avaliacao){
        avaliacoes.put(apelido, avaliacao);
    }

    public boolean avaliado(String apelido){
        return avaliacoes.containsKey(apelido);
    }

    public double media(){
        if (avaliacoes.isEmpty()) {
            return 0;
        }
        int soma = 0;
        for(int i : avaliacoes.values()){
            soma += i;
        }
        return (double) soma/avaliacoes.size();
    }
}

