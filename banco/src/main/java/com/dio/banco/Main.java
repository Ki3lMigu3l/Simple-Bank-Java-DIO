package com.dio.banco;

import com.dio.banco.model.Banco;
import com.dio.banco.model.ContaBancaria;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Banco banco = new Banco();

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());
            executarOpcao(opcao);
        }
    }

    private static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                criarConta();
                break;
            case 2:
                realizarDeposito();
                break;
            case 3:
                realizarSaque();
                break;
            case 4:
                verificarSaldo();
                break;
            case 5:
                sair();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void exibirMenu() {
        System.out.println("""
                    \n===== Conta Bancária =====
                    1. Criar conta
                    2. Depositar
                    3. Sacar
                    4. Verificar saldo
                    5. Sair
                    Escolha uma opção:
                """);
    }

    private static void criarConta() {
        System.out.println("Digite o número da conta: ");
        String numeroDaConta = scanner.nextLine();
        System.out.println("Digite o nome do titular: ");
        String titular = scanner.nextLine();
        banco.criarConta(numeroDaConta, titular);
    }

    private static void realizarDeposito() {
        ContaBancaria conta = obterConta();
        if (conta != null) {
            System.out.println("Digite o valor do deposito: ");
            double valorDeposito = Double.parseDouble(scanner.nextLine());
            conta.depositar(valorDeposito);
        }
    }

    private static void realizarSaque() {
        ContaBancaria conta = obterConta();
        if (conta != null) {
            System.out.println("Digite o valor do saque: ");
            double valorSaque = Double.parseDouble(scanner.nextLine());
            conta.sacar(valorSaque);
        }
    }

    private static void verificarSaldo() {
        ContaBancaria conta = obterConta();
        if (conta != null) {
            System.out.println("Saldo atual: " + conta.getSaldo());
        }
    }

    private static ContaBancaria obterConta () {
        System.out.println("Digite o número da conta: ");
        String numeroDaConta = scanner.nextLine();
        return banco.buscarContaBancaria(numeroDaConta);
    }

    private static void sair() {
        System.out.println("Saindo...");
        scanner.close();
        System.exit(0);
    }
}