package com.furb.poo.exemplos.aula01;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Matilha {
    
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "pingo";
        cachorro1.cor = "branco";
        cachorro1.peso = 12;
        cachorro1.raca = "labrador";
        
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "brutos";
        cachorro2.cor = "marron";
        cachorro2.peso = 21;
        cachorro2.raca = "pastor alemão";
        
        Cachorro cachorro3;
        cachorro3 = cachorro1;
        
        cachorro3.abanarRabo();
        
        cachorro3 = cachorro2;
        
        cachorro3.cor = "azul";
        
        System.out.println("A cor do pingo é: " + cachorro1.cor);
        System.out.println("A cor do brutos é: " + cachorro2.cor);
        
        System.out.println("A cor do cachorro3 é: " + cachorro3.cor);
               
        cachorro3 = new Cachorro();
        cachorro3.nome = "brutos";
        cachorro3.cor = "marron";
        cachorro3.peso = 21;
        cachorro3.raca = "pastor alemão";
        
        cachorro2.nome = "floquinho";
        
        System.out.println("Nome do cachorr02: " + cachorro2.nome);
        System.out.println("Nome do cachorr03: " + cachorro3.nome);
        
        
        int a = 5;
        int b = a;
        
        a = 10;
        
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
    }

}
