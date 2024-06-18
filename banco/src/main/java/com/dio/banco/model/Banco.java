package com.dio.banco.model;

import com.dio.banco.exception.ContaNaoEncontradaException;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private final Map<String, ContaBancaria> contas = new HashMap<>();
    public void criarConta (String numeroDaConta, String titular) {
        if (!contas.containsKey(numeroDaConta)) {
            contas.put(numeroDaConta, new ContaBancaria(numeroDaConta, titular));
            System.out.println("Conta criada com sucesso");
        } else {
            System.out.println("Uma conta com este número já existe");
        }
    }

    public ContaBancaria buscarContaBancaria (String numeroDaConta) {
        ContaBancaria conta = contas.get(numeroDaConta);
        if (conta == null) {
            throw new ContaNaoEncontradaException(numeroDaConta);
        }

        return conta;
    }
}
