package com.furb.poo.exemplos.aula09;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class CalculadoraCientifica extends Calculadora {

    public double raizQuadrada(double num1) {
        
        double soma = somar(num1, 10);
        
        return 0.0; 
    }
    
    @Override
    public double somar(double num1, double num2) {
        if (num1 > num2) {
            return super.somar(num1, num2);
        } else {
            return num1 - num2;
        }
    }

    

}
