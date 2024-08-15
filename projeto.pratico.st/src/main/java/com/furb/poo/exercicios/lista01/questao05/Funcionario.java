package com.furb.poo.exercicios.lista01.questao05;

/**
 *
 * @author jfeli
 */
public class Funcionario {
    
    private String nome;
    private double salario;
    
    public void setNome(String nome){
        this.nome = nome;
}
    
    public String getNome (String nome){
        return nome;        
    }
    
    public void setSalario (double salario){
        this.salario = salario;
    }
    
    public double getSalario (){
        return salario;
    }
    
    public double calcularIrpf(){
        double imposto = 0;
        double diferenca = 0;
        
        if (getSalario() > 1903.98) {
            
            if (getSalario() <= 2826.65) {
                // 2a faixa do IR
                diferenca = getSalario() - 1903.98;
                imposto = diferenca * (7.5/100);
            } else if (getSalario() <= 3751.05) {
                // 2a faixa do IR
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100);
                
                // 3a faixa do IR
                diferenca = getSalario() - 2826.65;
                imposto += (diferenca * (15./100.));
                
            } else if (getSalario() <= 4664.68) {
                // 2a faixa do IR
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100);
                
                // 3a faixa do IR
                diferenca = 3751.05 - 2826.65;
                imposto += diferenca * (15/100);
                
                // 4a faixa do IR
                diferenca = getSalario() - 3751.05;
                imposto += diferenca * (22.5/100);
            } else{
                // 2a faixa do IR
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100);
                
                // 3a faixa do IR
                diferenca = 3751.05 - 2826.65;
                imposto += diferenca * (15/100);
                
                // 4a faixa do IR
                diferenca = 4664.68 - 3751.05;
                imposto += diferenca * (22.5/100);
                
                // 5a faixa do IR
                diferenca = getSalario() - 4664.68;
                imposto += diferenca * (27.5/100);
            }
             
        }
        
        return imposto;
    }
    
    
}
