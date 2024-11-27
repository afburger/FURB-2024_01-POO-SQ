package com.furb.poo.provas.prova02.model;

/**
 * Representa a locação de um veículo por uma pessoa.
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public abstract class Locacao implements Relatorio {

    private Pessoa pessoa;
    private int quantidadeDias;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    
    /**
     * Deve retornar o valor total da locação.
     * @return o valor total da locação.
     */
    public abstract Double getValorTotal();
    
}
