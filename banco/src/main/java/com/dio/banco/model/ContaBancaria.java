package com.dio.banco.model;

public class ContaBancaria {
    private final String numeroDaConta;
    private final String titular;
    private double saldo;

    public ContaBancaria(String numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = 0d;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
