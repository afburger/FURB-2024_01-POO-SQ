package com.furb.poo.provas.prova03.model;

/**
 * Representa um aluno 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Aluno {

    private String nome;
    private Double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    // Nome: André, Média: 6.0
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Média: " + getMedia();
    }
    
    // André,6.0
    public String persistir() {
        return getNome() + "," + getMedia();
    }
}
