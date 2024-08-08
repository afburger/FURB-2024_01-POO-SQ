package com.furb.poo.exercicios.lista01.questao04;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    
    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);

        Pessoa[] vetorPessoas = new Pessoa[3];
        
        for(int i = 0; i < vetorPessoas.length; i++) {
            Pessoa pessoa = new Pessoa();
            
            System.out.println("Informe o nome da pessoa " + i + ":");
            pessoa.nome = teclado.next();
            
            System.out.println("Informe o peso da pessoa " + i + ":");
            pessoa.peso = teclado.nextDouble();
            
            System.out.println("Informe a altura da pessoa " + i + ":");
            pessoa.altura = teclado.nextDouble();
            
            vetorPessoas[i] = pessoa;
           
        }
        
        for (int i = vetorPessoas.length - 1; i >= 0; i--) {
            Pessoa pes = vetorPessoas[i];
            System.out.println("Pessoa: " + pes.nome + " tem um IMC de: " + pes.calcularImc());
        }
        
        teclado.close();

    }

}
