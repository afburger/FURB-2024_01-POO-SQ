package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Departamento2 {

    private String nome;
    private Funcionario funcionario;

    public Departamento2(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
}
