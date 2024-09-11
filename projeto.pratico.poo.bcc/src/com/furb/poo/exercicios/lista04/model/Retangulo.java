package com.furb.poo.exercicios.lista04.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Retangulo {

    private int altura;
    private int comprimento;
    
    /**
     * Construtor padrão.
     */
    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }
    
    /**
     * Construtor padrão que recebe parâmetros.
     * @param comprimento representa o comprimento do retângulo.
     * @param altura representa a altura do retângulo.
     */
    public Retangulo(int comprimento, int altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }
    
    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
    
    /**
     * Define o comprimento do retângulo.
     * @param comprimento o comprimento do retângulo.
     * Caso o valor seja igual a zero ou negativo, 
     * será lançado um {@link IllegalArgumentException}
     */
    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }

    public int getComprimento() {
        return comprimento;
    }
    
    /**
     * Efetuar o calculo do perímetro do retângulo.
     * @return o perímetro do retângulo.
     */
    public int calcularPerimetro() {
//        return comprimento + comprimento + altura + altura;
        return (comprimento * 2) + (altura * 2);
    }
    
    /**
     * Efetuar o calculo da área do retângulo.
     * @return a área do retângulo.
     */
    public int calcularArea() {
        return comprimento * altura;
    }
    
}
