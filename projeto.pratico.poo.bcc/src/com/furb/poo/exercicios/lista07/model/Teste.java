package com.furb.poo.exercicios.lista07.model;

import java.util.ArrayList;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Teste {

    private ArrayList<Bairro> bairros = new ArrayList<>();
    
    public Bairro maiorCoeficiente() {
        Bairro bairroMaiorCoeficiente = null;
        
        for (Bairro bairro : bairros) {
            if (bairroMaiorCoeficiente == null) {
                bairroMaiorCoeficiente = bairro;
            } else {
                if (bairroMaiorCoeficiente.getCoeficienteIptu() < bairro.getCoeficienteIptu()) {
                    bairroMaiorCoeficiente = bairro;
                }
            }
        }
        return bairroMaiorCoeficiente;
    }
    
}
