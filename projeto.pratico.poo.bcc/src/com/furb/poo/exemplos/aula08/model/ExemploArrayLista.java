package com.furb.poo.exemplos.aula08.model;

import java.util.ArrayList;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ExemploArrayLista {

    public static void main(String[] args) {
//        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
//        listaFuncionario.add(new Funcionario("André"));
//        listaFuncionario.add(new Funcionario("Felipe"));
//        listaFuncionario.add(new Funcionario("João"));
//        listaFuncionario.add(new Funcionario("Maria"));
//        
//        for (Funcionario func : listaFuncionario) {
//            System.out.println(func.getNome());
//        }

        Departamento ti = new Departamento(new Funcionario("Zé"));
        ti.incluirSubordinado(new Funcionario("André"));
        ti.incluirSubordinado(new Funcionario("Felipe"));
        ti.incluirSubordinado(new Funcionario("João"));
        ti.incluirSubordinado(new Funcionario("Maria"));
        
        for (Funcionario func : ti.getSubordinados()) {
            System.out.println(func.getNome());
        }
        
    }
    
}
