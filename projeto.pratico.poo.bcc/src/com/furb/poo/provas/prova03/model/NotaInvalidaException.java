package com.furb.poo.provas.prova03.model;

/**
 * Exceção lançada quando uma nota do aluno for inválida.
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class NotaInvalidaException extends RuntimeException {

    public NotaInvalidaException() {
        super("A nota deve ser maior ou igual a ZERO e menor ou igual a DEZ");
    }
    
}
