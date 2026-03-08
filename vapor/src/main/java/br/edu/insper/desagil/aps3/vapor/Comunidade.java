package br.edu.insper.desagil.aps3.vapor;

import java.util.ArrayList;
import java.util.List;

public class Comunidade {
    private List<Usuario> membros = new ArrayList<>();

    public Comunidade(List<Usuario> membros){
        this.membros = new ArrayList<>(membros);
    }

    public void adicionaMembro(Usuario usuario){
        membros.add(usuario);
    }

    public List<String> apelidosMembros(){
        List<String> apelidosMembros = new ArrayList<>();

        for (Usuario usuario : membros) {
            apelidosMembros.add(usuario.getApelido());
        }

        return apelidosMembros;

    }
}