package com.dio.banco.exception;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException (double saldo, double valorSaque) {
        super("Saldo insuficiente.\n" + "Saldo atual: " + saldo + ", valor do saque: " + valorSaque);
    }
}
