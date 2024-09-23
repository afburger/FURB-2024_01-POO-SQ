package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class EmpresaMain {

    public static void main(String[] args) {
        
        Funcionario gerenteAndre = new Funcionario();
        gerenteAndre.setNome("André");
        gerenteAndre.setRamal(1111);
        
        Departamento adm = new Departamento(gerenteAndre);
        adm.setNome("Administrativo");
        
        System.out.println("Departamento: " + adm.getNome());
        System.out.println("Gerente: " + adm.getGerente().getNome()
                + " ramal: " + adm.getGerente().getRamal());
        
        gerenteAndre.setNome("André Felipe");
        
        System.out.println("Gerente: " + adm.getGerente().getNome()
                + " ramal: " + adm.getGerente().getRamal());
    }
    
}
