package com.furb.poo.exemplos.aula01;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Cachorro {

    String nome;
    String raca;
    String cor;
    double peso;
    
    public void latir() {
        System.out.println(nome + " Latindo");
    }
    
    public void abanarRabo() {
        System.out.println(nome + " Abanando Rabo");
    }
    
    public void pegarCoisa(String objeto) {
        System.out.println(nome + "está pegando o(a) " + objeto);
    }
}
