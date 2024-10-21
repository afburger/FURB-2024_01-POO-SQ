package com.furb.poo.exemplos.aula10.model.classeabstrata;

import java.util.ArrayList;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class TestePolimorfismo {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Triangulo());
        figuras.add(new Retangulo());
        figuras.add(new Pentagono());
        figuras.add(new Triangulo());
        figuras.add(new Retangulo());
        figuras.add(new Circulo());
        
        for (Figura figura : figuras) {
            figura.desehar();
        }
        
    }
    
}
