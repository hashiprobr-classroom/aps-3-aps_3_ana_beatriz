package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogoTest {

    private static final double DELTA = 0.01;
    private Jogo j;

    @BeforeEach
    void setUp(){
        j = new Jogo(1,"Zelda");
    }

    @Test
    void constroi(){
        assertEquals(1,j.getId());
        assertEquals("Zelda",j.getNome());
        assertEquals(0,j.media(),DELTA);
    }

    @Test
    void avaliaUmaVez(){
        j.avalia("bia",3);

        assertTrue(j.avaliado("bia"));
        assertFalse(j.avaliado("ana"));
        assertEquals(3,j.media(),DELTA);
    }

    @Test
    void avaliaDuasVezes(){
        j.avalia("bia",3);
        j.avalia("ana",4);

        assertTrue(j.avaliado("bia"));
        assertTrue(j.avaliado("ana"));
        assertEquals(3.5,j.media(),DELTA);
    }

    @Test
    void avaliaTresVezes(){
        j.avalia("bia",3);
        j.avalia("ana",4);
        j.avalia("bia",5);

        assertEquals(4.5,j.media(),DELTA);
    }
}
