package com.furb.poo.exemplos.aula08.model;

import java.util.ArrayList;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Departamento {

    private String nome;
    private Funcionario gerente;
    private ArrayList<Funcionario> subordinados;

    public Departamento(Funcionario gerente) {
        this.gerente =  gerente;
        this.subordinados = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
    
    public void incluirSubordinado(Funcionario subordinado) {
        this.subordinados.add(subordinado);
    }
    
    public void removerSubordinado(Funcionario subordinado) {
        this.subordinados.remove(subordinado);
    }

    public ArrayList<Funcionario> getSubordinados() {
        return subordinados;
    }
    
    
}
