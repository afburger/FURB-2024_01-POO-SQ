package com.furb.poo.exemplos.aula09;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Teste {

    public static void main(String[] args) {
        // Vai gerar erro de compilação.
        /*
        Calculadora calc = new CalculadoraCientifica();
        System.out.println(calc.somar(5, 10));
        System.out.println(calc.raizQuadrada(5));
        */
        
        CalculadoraCientifica calc = new CalculadoraCientifica();
        System.out.println(calc.somar(5, 10));
        System.out.println(calc.raizQuadrada(5));
        
        
    }
    
}
