package com.furb.poo.exercicios.lista02.questao02;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ContaBanaria {

    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido para depósito");
        } else {
            saldo = saldo + valor;
        }
    }
    
    public void sacar(double valor) {
        if (valor < 0 || valor > saldo) {
             System.out.println("Valor inválido para saque");
        } else {
            saldo = saldo - valor;
        }
    }
    
    public void transferir(ContaBanaria contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    
    
}
