package com.furb.poo.provas.prova01.model;

/**
 * O enum {@code Periodo} representa os diferentes períodos de uma temporada para uma estadia,
 * classificando-os como alta, média e baixa temporada.
 * 
 * <p>Cada período possui uma denominação associada que descreve seu nome de forma legível. Esse enum
 * também contém métodos para acessar e representar essa denominação.
 * 
 * <p>Os períodos disponíveis são:
 * <ul>
 *   <li>{@link #ALTA_TEMPORADA}</li>
 *   <li>{@link #MEDIA_TEMPORADA}</li>
 *   <li>{@link #BAIXA_TEMPORADA}</li>
 * </ul>
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public enum Periodo {

    /** Representa o período de alta temporada. */
    ALTA_TEMPORADA("Alta temporada"),

    /** Representa o período de média temporada. */
    MEDIA_TEMPORADA("Média temporada"),

    /** Representa o período de baixa temporada. */
    BAIXA_TEMPORADA("Baixa temporada");

    private final String denominacao;

    /**
     * Construtor do enum {@code Periodo}, que associa uma denominação a cada constante.
     * 
     * @param denominacao A denominação textual do período.
     */
    private Periodo(String denominacao) {
        this.denominacao = denominacao;
    }

    /**
     * Retorna a denominação do período.
     * 
     * @return A denominação textual do período.
     */
    public String getDenominacao() {
        return denominacao;
    }

    /**
     * Retorna a representação textual do período, que corresponde à sua denominação.
     * 
     * @return A denominação do período.
     */
    @Override
    public String toString() {
        return getDenominacao();
    }
}

