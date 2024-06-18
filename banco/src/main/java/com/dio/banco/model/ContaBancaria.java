package com.dio.banco.model;

import com.dio.banco.exception.SaldoInsuficienteException;
import com.dio.banco.exception.ValorInvalidoException;

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

    public void depositar (double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);
        }
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void sacar (double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);
        }
        if (saldo < valor) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso.");
    }

}
