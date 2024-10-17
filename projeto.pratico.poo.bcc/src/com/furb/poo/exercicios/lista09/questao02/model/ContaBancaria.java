package com.furb.poo.exercicios.lista09.questao02.model;

import java.util.ArrayList;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ContaBancaria {
    
    private String numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimento> movimentos = new ArrayList<>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        setSaldo(getSaldo() + valor);
        
        Movimento movDeposito = new Movimento(valor, TipoMovimento.CREDITO);
        incluirMovimento(movDeposito);
    }
    
    public void sacar(double valor) {
        if (valor <= 0 || getSaldo() < valor) {
            throw new IllegalArgumentException("Valor inválido");
        }
        setSaldo(getSaldo() - valor);
        
        Movimento movSacar = new Movimento(valor, TipoMovimento.DEBITO);
        incluirMovimento(movSacar);
    }
    
    public void transferir(ContaBancaria contaDestino, double  valor) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }
    
    public void incluirMovimento(Movimento mov) {
        movimentos.add(mov);
    }
}
