package com.furb.poo.provas.prova02.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * 
 * Representa um veículo que será locado.
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Veiculo implements Relatorio {

    private String placa;
    private int km;
    private Double precoDiaria;
    private Categoria categoria;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(Double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String imprimir() {
        DecimalFormat decimalFormat = new DecimalFormat("R$ #,###.##");
        String relatorio = "Placa: " + getPlaca()
                + "\nKM: " + getKm()
                + "\nCategoria:" + getCategoria()
                + "\nValor da diária: " + decimalFormat.format(getPrecoDiaria());
        return relatorio;
    }
    
}
