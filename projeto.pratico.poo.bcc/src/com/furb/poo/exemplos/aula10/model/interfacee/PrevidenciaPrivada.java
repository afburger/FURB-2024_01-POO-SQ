package com.furb.poo.exemplos.aula10.model.interfacee;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class PrevidenciaPrivada implements Pagavel{

    @Override
    public double calcularValorPagar() {
        return 500.00;
    }

}
