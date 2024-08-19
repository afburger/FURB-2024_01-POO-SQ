package com.furb.poo.exercicios.lista02.questao02;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {

    public static void main(String[] args) {
        ContaBanaria contaUm = new ContaBanaria();
        contaUm.setTitular("zequinha");
        contaUm.setNumero("12345");
        
        ContaBanaria contaDois = new ContaBanaria();
        contaDois.setTitular("titular");
        contaDois.setNumero("9876");
        
        // a. Realize depósitos na primeira conta nos valores de R$ 1.000,00 e R$ 700,00.
        contaUm.depositar(1000.00);
        contaUm.depositar(700.00);
        
        // b. Realize depósitos na segunda conta nos valores de R$ 5.000,00.
        contaDois.depositar(5000.00);
        
        // c. Faça um saque na 2ª conta no valor de R$ 3.000,00.
        contaDois.sacar(3000.00);
        
        // d. Transfira R$ 1.800,00 da 2ª conta para a 1ª conta
        contaDois.transferir(contaUm, 1800.00);
        
        System.out.println("Conta 1 do " + contaUm.getTitular() + " tem um saldo de: R$ " + contaUm.getSaldo());
        
        System.out.println("Conta 2 do " + contaDois.getTitular() + " tem um saldo de: R$ " + contaDois.getSaldo());
    }
}
