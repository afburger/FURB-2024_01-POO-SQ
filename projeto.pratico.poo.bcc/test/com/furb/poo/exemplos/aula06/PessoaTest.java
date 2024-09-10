/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.furb.poo.exemplos.aula06;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PessoaTest {
    

    @Test
    public void test2_CalcularIMCValido() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(100);
        pessoa.setAltura(2);
        double imc = pessoa.calcularImc();
        assertEquals(27.0, imc, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test1_CalcularIMCInvalido() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(-100);
    }
    
}
