package com.furb.poo.exemplos.aula02;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {

    public static void main(String[] args) {
        
        // Declaração de Objeto
        Pessoa variavelPessoa;
       
        // Criando ou inicializando o objeto.
        variavelPessoa = new Pessoa();
        
        // Utilização do objeto.
        variavelPessoa.setPeso(78);
        variavelPessoa.altura = 1.75;
        
        
        // Exemplo de uma variável do tipo primitivo ou variável de instância.
        double imcCalculado;
        
        System.out.println("Vamos calcular o IMC da pessoa: ");
        
        imcCalculado = variavelPessoa.calcularImc();
        
        System.out.println("O IMC da pessoa é: " + imcCalculado);
        
    }
    
}
