package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class FuncionarioReflexivo {

    private String nome;
    private FuncionarioReflexivo gerente;
    private FuncionarioReflexivo empregado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioReflexivo getGerente() {
        return gerente;
    }

    public void setGerente(FuncionarioReflexivo gerente) {
        this.gerente = gerente;
    }

    public FuncionarioReflexivo getEmpregado() {
        return empregado;
    }

    public void setEmpregado(FuncionarioReflexivo empregado) {
        this.empregado = empregado;
    }
    
    
    
}
