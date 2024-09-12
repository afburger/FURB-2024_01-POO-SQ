package com.furb.poo.exercicios.lista06.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Funcionario {

    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que Zero");
        }
        this.salario = salario;
    }
    
//    public double calcularIrpf() {
//        double imposto = 0;
//        double diferenca = 0;
//        
//        if (salario > 1903.98) {
//            if (salario <= 2826.65) { // 2ª Faixa
//                diferenca = salario - 1903.98;
//                imposto = diferenca * (7.5/100.0);
//            } else if (salario <= 3751.05) { // 3ª Faixa
//                diferenca = 2826.65 - 1903.98;
//                imposto = diferenca * (7.5/100.0);
//                
//                diferenca = salario - 2826.65;
//                imposto += (diferenca * (15.0/100.0));
//            } else if (salario <= 4664.68) { // 4ª faixa
//                // Calcula o imposto da 2ª faixa.
//                diferenca = 2826.65 - 1903.98;
//                imposto = diferenca * (7.5/100.0);
//                
//                // Calcula o imposto da 3ª faixa.
//                diferenca = 3751.05 - 2826.65;
//                imposto += (diferenca * (15.0/100.0));
//                
//                // Calcula o imposto da 4ª faixa.
//                diferenca = salario - 3751.05;
//                imposto += (diferenca * (22.5/100.0));
//            } else { // 5ª faixa.
//                // Calcula o imposto da 2ª faixa.
//                diferenca = 2826.65 - 1903.98;
//                imposto = diferenca * (7.5/100.0);
//                
//                // Calcula o imposto da 3ª faixa.
//                diferenca = 3751.05 - 2826.65;
//                imposto += (diferenca * (15.0/100.0));
//                
//                // Calcula o imposto da 4ª faixa.
//                diferenca = 4664.68 - 3751.05;
//                imposto += (diferenca * (22.5/100.0));
//                
//                // Calcula o imposto da 5ª faixa.
//                diferenca = salario - 4664.68;
//                imposto += (diferenca * (27.5/100.0));
//            }
//        }
//        
//        return imposto;
//    }
    
    public double calcularIrpf() {
        double imposto = 0;
        double diferenca = 0;
        
        FaixaIrpf faixaIdentificada = identificarFaixaIrpf();
        
        if (!FaixaIrpf.PRIMEIRA.equals(faixaIdentificada)) {
            if (FaixaIrpf.SEGUNDA.equals(faixaIdentificada)) { // 2ª Faixa
                diferenca = salario - 1903.98;
                imposto = diferenca * (7.5/100.0);
            } else if (FaixaIrpf.TERCEIRA.equals(faixaIdentificada)) { // 3ª Faixa
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100.0);
                
                diferenca = salario - 2826.65;
                imposto += (diferenca * (15.0/100.0));
            } else if (FaixaIrpf.QUARTA.equals(faixaIdentificada)) { // 4ª faixa
                // Calcula o imposto da 2ª faixa.
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100.0);
                
                // Calcula o imposto da 3ª faixa.
                diferenca = 3751.05 - 2826.65;
                imposto += (diferenca * (15.0/100.0));
                
                // Calcula o imposto da 4ª faixa.
                diferenca = salario - 3751.05;
                imposto += (diferenca * (22.5/100.0));
            } else { // 5ª faixa.
                // Calcula o imposto da 2ª faixa.
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100.0);
                
                // Calcula o imposto da 3ª faixa.
                diferenca = 3751.05 - 2826.65;
                imposto += (diferenca * (15.0/100.0));
                
                // Calcula o imposto da 4ª faixa.
                diferenca = 4664.68 - 3751.05;
                imposto += (diferenca * (22.5/100.0));
                
                // Calcula o imposto da 5ª faixa.
                diferenca = salario - 4664.68;
                imposto += (diferenca * (27.5/100.0));
            }
        }
        return imposto;
    }
    
    public FaixaIrpf identificarFaixaIrpf() {
        if (salario <= 1903.98) {
            return FaixaIrpf.PRIMEIRA;
        } else if (salario <= 2826.65) {
            return FaixaIrpf.SEGUNDA;
        } else if (salario <= 3751.05) {
            return FaixaIrpf.TERCEIRA;
        } else if (salario <= 4664.68) {
            return FaixaIrpf.QUARTA;
        } else {
            return FaixaIrpf.QUINTA;
        }
    }
        
}
