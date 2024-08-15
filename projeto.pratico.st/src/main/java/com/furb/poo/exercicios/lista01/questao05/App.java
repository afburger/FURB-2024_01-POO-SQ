package com.furb.poo.exercicios.lista01.questao05;


/**
 *
 * @author jfeli
 */
public class App {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
    
        f1.setNome("João Gabriel");
        f1.setSalario(3000);
    
    
        System.out.println("Valor do IRPF: " + f1.calcularIrpf());
    }   
    
}
