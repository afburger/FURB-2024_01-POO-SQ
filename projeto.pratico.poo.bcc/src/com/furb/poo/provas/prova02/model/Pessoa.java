package com.furb.poo.provas.prova02.model;

/**
 * Representa uma pessoa que irá realizar a locação de um veículo
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {

    private String nome;
    private String cpfCnpj;
    private String telefone;
    private String email;
    private boolean fisica;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFisica() {
        return fisica;
    }

    public void setFisica(boolean fisica) {
        this.fisica = fisica;
    }
    
}
