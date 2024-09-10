package com.furb.poo.exercicios.lista05.view;

import com.furb.poo.exercicios.lista05.model.Ponto;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Teste {

    public static void main(String[] args) {
        
        Ponto ponto1 = new Ponto(1, 3);
        
        Ponto ponto2 = new Ponto(2, 5);
        
        ponto1.calcularDistancia(ponto2);
        
        
        
        Ponto.calcularDistancia(1, 3, 2, 5);
        
    }
    
}
