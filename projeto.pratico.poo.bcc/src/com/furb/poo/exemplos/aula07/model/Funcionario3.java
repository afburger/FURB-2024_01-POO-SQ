package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Funcionario3 {

    private String nome;
    private int ramal;
    private Departamento3 departamento;

    public Funcionario3(String nome) {
        this.nome = nome;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public Departamento3 getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento3 departamento) {
        this.departamento = departamento;
    }
    
    
}
