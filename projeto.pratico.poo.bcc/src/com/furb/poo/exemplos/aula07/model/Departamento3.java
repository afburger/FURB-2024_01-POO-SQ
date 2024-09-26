package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Departamento3 {

    private String nome;
    private Funcionario3 gerente;

    public Departamento3(Funcionario3 gerente) {
        this.gerente =  gerente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario3 getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario3 gerente) {
        this.gerente = gerente;
    }
    
    
}
