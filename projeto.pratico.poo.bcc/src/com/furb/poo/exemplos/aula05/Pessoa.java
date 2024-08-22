package com.furb.poo.exemplos.aula05;

/**
 * Declaração da classes
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

    public Pessoa() {
    }

    public Pessoa(double altura, double peso, String nome) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 3) {
            throw new IllegalArgumentException("Altura da pessoa inválida");
        }
        this.altura = altura;
    }

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
