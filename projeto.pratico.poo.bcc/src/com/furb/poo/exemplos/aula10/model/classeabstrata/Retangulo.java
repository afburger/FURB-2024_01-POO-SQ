package com.furb.poo.exemplos.aula10.model.classeabstrata;

import java.awt.Color;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Retangulo extends Figura {

    private int largura;
    private int altura;

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void desehar() {
        System.out.println("Essa figura é um Retangulo");
    }
    
}
