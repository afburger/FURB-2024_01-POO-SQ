/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furb.poo.exemplos.aula12.model.objetos;

import com.furb.poo.exercicios.lista08.model.*;
import java.io.Serializable;

/**
 *
 */
public class Aluno implements Serializable {
    
    private int matricula;
    private String nome;
    private double notaEnem;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        this.notaEnem = notaEnem;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + " Matricula: " + matricula + " Nota enem: " + notaEnem;
    }
   
    
}
