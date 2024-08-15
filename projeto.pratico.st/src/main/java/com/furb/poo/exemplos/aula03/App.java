package com.furb.poo.exemplos.aula03;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {

    public static void main(String[] args) {
        
        // Declaração do objeto
        Pessoa p1;
        
        // Criação do objeto;
        p1 = new Pessoa();
        
        // Utilização do objeto.
        p1.setNome("andre");
        p1.setAltura(2);
        p1.setPeso(-10);
        
        double imc = p1.calcularImc();
        
        System.out.println("IMC Pessoa 1" + imc);
        
    }
}
