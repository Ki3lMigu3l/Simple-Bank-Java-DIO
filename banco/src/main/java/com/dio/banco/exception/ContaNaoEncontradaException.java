package com.dio.banco.exception;

public class ContaNaoEncontradaException extends RuntimeException {
    public ContaNaoEncontradaException (String numeroDaConta) {
        super("Conta com número " + numeroDaConta + " não foi encontrado.");
    }
}
