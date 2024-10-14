package com.furb.poo.exemplos.aula09.revisao;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    /**
     * Método sobrescrito, que retorna o valor do bônus, de acordo com o cargo do funcionário
     */
    @Override
    public void calcularBonus() {
        System.out.println("O bônus do desenvolvedor é: " + (getSalario() * 0.50));
    }
    
    
}
