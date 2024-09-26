package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Main3 {

    public static void main(String[] args) {
        
        Funcionario3 gerenteAndre = new Funcionario3("André");
        Departamento3 departamentoTI = new Departamento3(gerenteAndre);
        departamentoTI.setNome("TI");
        
        gerenteAndre.setDepartamento(departamentoTI);
        
        System.out.println("Departamento do funcionario:" + gerenteAndre.getDepartamento().getNome());
        System.out.println("Gerente de um departamento:" + departamentoTI.getGerente().getNome());
    }
}
