package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {
    private Usuario dono;
    private Jogo j1;
    private Jogo j2;
    private Jogo j3;
    private Loja l;

    @BeforeEach
    void setUp(){
        dono = new Usuario("bia","Beatriz");
        j1 = new Jogo(1,"Zelda");
        j2 = new Jogo(2,"Minecraft");
        j3 = new Jogo(3,"The Sims");

        List<Jogo> jogos = new ArrayList<>();
        jogos.add(j1);
        jogos.add(j2);
        jogos.add(j3);

        l = new Loja(dono,jogos);
    }

    @Test
    void constroi(){
        assertEquals(dono,l.getDono());
        assertEquals(0,l.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaUmJogo(){
        j1.avalia(dono.getApelido(),3);
        assertEquals(1,l.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaDoisJogos() {
        j1.avalia(dono.getApelido(), 3);
        j2.avalia(dono.getApelido(), 3);
        assertEquals(2, l.numeroAvaliados(dono));
    }

    @Test
    void doisUsuariosAvaliamUmJogo() {
        Usuario novo = new Usuario("ana","Ana Carolina");
        j1.avalia(dono.getApelido(), 3);
        j1.avalia(novo.getApelido(), 3);
        assertEquals(1, l.numeroAvaliados(dono));
        assertEquals(1,l.numeroAvaliados(novo));
    }

    @Test
    void doisUsuariosAvaliamDoisJogos() {
        Usuario novo = new Usuario("ana","Ana Carolina");
        j1.avalia(dono.getApelido(), 3);
        j2.avalia(novo.getApelido(), 3);
        assertEquals(1, l.numeroAvaliados(dono));
        assertEquals(1,l.numeroAvaliados(novo));
    }



}
