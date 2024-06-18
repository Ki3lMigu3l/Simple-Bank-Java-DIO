package com.dio.banco.exception;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException (double valor) {
        super("Valor inválido: " + valor);
    }
}
