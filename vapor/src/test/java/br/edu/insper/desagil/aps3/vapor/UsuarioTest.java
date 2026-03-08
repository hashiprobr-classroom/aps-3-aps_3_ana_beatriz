package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    private Usuario u;

    @BeforeEach
    void setUp(){
        u = new Usuario("bia","Beatriz");
    }

    @Test
    void constroi(){
        assertEquals("bia",u.getApelido());
        assertEquals("Beatriz",u.getNome());
    }

    @Test
    void mudaNome(){
        u.setNome("Ana");
        assertEquals("Ana",u.getNome());
    }

}
