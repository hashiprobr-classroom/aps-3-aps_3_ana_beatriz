package br.edu.insper.desagil.aps3.vapor;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private Usuario dono;
    private List<Jogo> jogos = new ArrayList<>();

    public Usuario getDono() {
        return dono;
    }

    public Loja(Usuario dono, List<Jogo> jogos){
        this.dono = dono;
        this.jogos = jogos;
    }

    public int recebeUsuario(Usuario usuario){
        int contador = 0;
        for (Jogo jogo : jogos) {
            if (jogo.verificaChave(usuario.getApelido())) {
                contador+=1;
            }
        }

        return contador;

    }
}
