package com.furb.poo.provas.prova01.model;

/**
 * A classe {@code Estadia} representa uma estadia de um hóspede em um determinado período, 
 * com base na quantidade de dias e no período escolhido, podendo aplicar diferentes tarifas 
 * de acordo com a temporada.
 * 
 * <p>Existem diferentes regras de preço baseadas na temporada (alta ou baixa) e no número 
 * de dias da estadia. O preço da estadia pode sofrer ajustes como aumentos para alta temporada, 
 * descontos para baixa temporada e outros ajustes baseados na duração da estadia.
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Estadia {

    private Periodo periodo;
    private int quantidadeDias;

    /**
     * Construtor que inicializa a estadia com um período e a quantidade de dias.
     * 
     * @param periodo O período da estadia, que pode ser alta ou baixa temporada.
     * @param quantidadeDias A quantidade de dias da estadia.
     * @throws IllegalArgumentException Se o período for {@code null} ou se a quantidade de dias for inválida.
     */
    public Estadia(Periodo periodo, int quantidadeDias) {
        setPeriodo(periodo);
        setQuantidadeDias(quantidadeDias);
    }

    /**
     * Define o período da estadia.
     * 
     * @param periodo O período da estadia, não pode ser {@code null}.
     * @throws IllegalArgumentException Se o período for {@code null}.
     */
    public void setPeriodo(Periodo periodo) {
        if (periodo == null) {
            throw new IllegalArgumentException("Período não pode ser vazio.");
        }
        this.periodo = periodo;
    }

    /**
     * Retorna o período da estadia.
     * 
     * @return O período da estadia.
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     * Define a quantidade de dias da estadia.
     * 
     * @param quantidadeDias A quantidade de dias da estadia.
     * @throws IllegalArgumentException Se a quantidade de dias for menor que 5 na alta temporada 
     * ou menor ou igual a 0 em qualquer outro caso.
     */
    public void setQuantidadeDias(int quantidadeDias) {
        if (quantidadeDias < 5 && Periodo.ALTA_TEMPORADA.equals(periodo)) {
            throw new IllegalArgumentException("Para alta temporada o mínimo é de 5 diárias.");
        }
        if (quantidadeDias <= 0) {
            throw new IllegalArgumentException("Quantidade de diárias é inválida");
        }
        this.quantidadeDias = quantidadeDias;
    }

    /**
     * Retorna a quantidade de dias da estadia.
     * 
     * @return A quantidade de dias da estadia.
     */
    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    /**
     * Calcula o preço total a pagar pela estadia, levando em consideração o período e a quantidade de dias.
     * 
     * <p>O valor da diária pode sofrer acréscimo de 20% na alta temporada e desconto de 30% na baixa temporada.
     * Além disso, o valor pode ser ajustado com base em condições especiais, como o número de dias.
     * 
     * @return O valor total a ser pago pela estadia.
     */
    public float precoPagar() {
        float valorDiaria = 150.00f;
        float valorTotal = 0.00f;
        
        if (Periodo.ALTA_TEMPORADA.equals(periodo)) {
            valorDiaria = valorDiaria + (valorDiaria * 0.20f);
        }
        
        if (Periodo.BAIXA_TEMPORADA.equals(periodo)) {
            valorDiaria = valorDiaria - (valorDiaria * 0.30f);
        }
        
        valorTotal = valorDiaria * quantidadeDias;
        
        if (quantidadeDias == 1) {
            valorTotal = valorTotal + (valorTotal * 0.05f);
        }
        
        if (quantidadeDias > 7 && Periodo.ALTA_TEMPORADA.equals(periodo)) {
            valorTotal = valorTotal - (valorTotal * 0.02f);
        }
        
        return valorTotal;
    }
}

