package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeDeJogoTest {
    private Jogo j;
    private ComunidadeDeJogo cj;
    private Usuario u1;
    private Usuario u2;

    @BeforeEach
    void setUp(){
        j = new Jogo(1,"Zelda");
        cj = new ComunidadeDeJogo(List.of(),j);
        u1 = new Usuario("bia","Beatriz");
        u2 = new Usuario("ana", "Ana");
    }

    @Test
    void adicionaDoisInvalidos(){
        cj.adicionaMembro(u1);
        cj.adicionaMembro(u2);
        assertEquals(List.of(),cj.apelidosMembros());
    }

    @Test
    void adicionaUmInvalidoUmValido(){
        j.avalia(u1.getApelido(),3);
        cj.adicionaMembro(u1);
        cj.adicionaMembro(u2);
        assertEquals(List.of("bia"),cj.apelidosMembros());
    }

    @Test
    void adicionaDoisValidos(){
        j.avalia(u1.getApelido(),3);
        j.avalia(u2.getApelido(),3);
        cj.adicionaMembro(u1);
        cj.adicionaMembro(u2);
        assertEquals(List.of("bia","ana"),cj.apelidosMembros());
    }
}
