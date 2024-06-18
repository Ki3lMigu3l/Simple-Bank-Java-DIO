package com.dio.banco;

import com.dio.banco.model.Banco;

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
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void criarConta() {
        System.out.println("Digite o número da conta: ");
        String numeroDaConta = scanner.nextLine();
        System.out.println("Digite o nome do titular: ");
        String titular = scanner.nextLine();
        banco.criarConta(numeroDaConta, titular);
    }

    private static void exibirMenu() {
        System.out.println("""
                    \n=== Conta Bancária ===
                    1. Criar conta
                    2. Depositar
                    3. Sacar
                    4. Verificar saldo
                    5. Sair
                    Escolha uma opção: 
                """);
    }
}