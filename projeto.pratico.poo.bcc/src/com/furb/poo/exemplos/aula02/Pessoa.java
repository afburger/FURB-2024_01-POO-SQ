package com.furb.poo.exemplos.aula02;

/**
 * Declaração da classe
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {

    double altura;
    double peso;
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    double calcularImc() {
        return peso / (altura * altura);
    }
    
}
