package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class MainReflexivo {

    public static void main(String[] args) {
        
        FuncionarioReflexivo gerenteJoao = new FuncionarioReflexivo();
        gerenteJoao.setNome("João");
        
        FuncionarioReflexivo empregadoAndre = new FuncionarioReflexivo();
        empregadoAndre.setNome("André");
        
        gerenteJoao.setEmpregado(empregadoAndre);
        empregadoAndre.setGerente(gerenteJoao);
        
        System.out.println("Gerente:" + empregadoAndre.getGerente().getNome());
        System.out.println("Empregado:" + empregadoAndre.getNome());
    }
}
