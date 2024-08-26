package com.furb.poo.exemplos.aula06;

/**
 * Representa uma pessoa para a calculadora de IMC
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {
    
    // Variável estática ou da classe.
    public static int contador = 0;
    // Constante com o final, não pode ter o seu valor alterado.
    public static final int cont = 12;
    
    private double altura;
    private double peso;
    private String nome;

    /**
     * 
     * Construtor padrão.
     * 
     */
    public Pessoa() {
    }

    /**
     * Construtor para instanciar uma pessoa com as suas informações.
     * @param alturaPessoa - A altura da pessoa.
     * @param peso - O peso da pessoa.
     * @param nome - O nome da pessoa.
     */
    public Pessoa(double alturaPessoa, double peso, String nome) {
        this.altura = alturaPessoa;
        this.peso = peso;
        this.nome = nome;
    }

    /**
     * Retorna a altura de uma pessoa.
     * @return 
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Metodo responsável por definir a altura de uma pessoa.
     * @param altura - valor <code>Double</code> que será atribuido para a altura da pessoa
     */
    public void setAltura(double altura) {
        if (altura > 3) {
            throw new IllegalArgumentException("Altura da pessoa inválida");
        }
        this.altura = altura;
    }

    /**
     * 
     * @return o valor do peso da pessoa.
     */
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException();
        }
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double calcularImc() {
        return calcularImc(peso, altura);
    }
    
    public static double calcularImc(double peso, double altura) {
         return peso / (altura * altura);
    }
}
