package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeTest {

    private Comunidade c;

    @BeforeEach
    public void setUp(){
        Usuario u1 = new Usuario("bia","Beatriz");
        Usuario u2 = new Usuario("ana","Ana Carolina");

        c = new Comunidade(List.of(u1,u2));
    }

    @Test
    void constroi(){
        assertEquals(List.of("bia","ana"),c.apelidosMembros());
    }

    @Test
    void adicionaUmMembro(){
        Usuario u3 = new Usuario("guga","Gustavo");
        c.adicionaMembro(u3);
        assertEquals(List.of("bia","ana","guga"),c.apelidosMembros());
    }

    @Test
    void adicionaDoisMembros(){
        Usuario u3 = new Usuario("guga","Gustavo");
        Usuario u4 = new Usuario("lu","Luana");
        c.adicionaMembro(u3);
        c.adicionaMembro(u4);
        assertEquals(List.of("bia","ana","guga","lu"),c.apelidosMembros());
    }

}
