package com.furb.poo.exercicios.lista01.questao01;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {

    public static void main(String[] args) {
        
        // declaração da variável
        Pessoa variavelPessoa;
        // Inicialização da variável
        variavelPessoa = new Pessoa();
        
        // Aqui faz as duas coisas juntas
        Pessoa variacalPessoaDois = new Pessoa();
        
        variavelPessoa.peso = 78;
        variavelPessoa.altura = 1.75;
        
        double imcCalculado = variavelPessoa.calcularImc();
        
        System.out.println("O IMC da pessoa é: " + imcCalculado);
        
    }
    
}
