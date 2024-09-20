package com.furb.poo.provas.prova01.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class EstadiaTest {
    
    @Test
    public void testUm() {
        Estadia estadia = new Estadia(Periodo.ALTA_TEMPORADA, 8);
        assertEquals(1411.20f, estadia.precoPagar(), 0);
    }
    
     @Test
    public void testDois() {
        Estadia estadia = new Estadia(Periodo.MEDIA_TEMPORADA, 1);
        assertEquals(157.50f, estadia.precoPagar(), 0);
    }
    
     @Test
    public void testTres() {
        Estadia estadia = new Estadia(Periodo.BAIXA_TEMPORADA, 5);
        assertEquals(525f, estadia.precoPagar(), 0);
    }
    
     @Test
    public void testQuatro() {
        Estadia estadia = new Estadia(Periodo.BAIXA_TEMPORADA, 1);
        assertEquals(110.25f, estadia.precoPagar(), 0);
    }
    
     @Test
    public void testCinco() {
        Estadia estadia = new Estadia(Periodo.MEDIA_TEMPORADA, 3);
        assertEquals(450f, estadia.precoPagar(), 0);
    }
}
