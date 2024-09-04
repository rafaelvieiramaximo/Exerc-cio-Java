package Conta;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        int numeroP;
        double saldoP;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem Vindo, digite o número da sua conta, por favor:");
        numeroP = entrada.nextInt();
        System.out.println("Agora digite o saldo, por favor:");
        saldoP = entrada.nextDouble();

        ContaCorrente minhaConta = new ContaCorrente(numeroP, saldoP);

        System.out.println("\n\nOlá, Seja Bem vindo a sua conta: " + minhaConta.numero);

        System.out.println("\nO Saldo atual da sua conta: " + minhaConta.saldo);

        int opcao, saida;
        double valor;

        do {

            System.out.println("\nQual operação você deseja realizar:");

            System.out.println("1 - Depositar.");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consulta o saldo");
            System.out.println("4 - Sair.\n");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:

                    do {
                        System.out.println(
                                String.format("\nDigite o valor do depósito na Conta " + minhaConta.numero + " : "));
                        valor = entrada.nextDouble();

                        if (valor > 0) {
                            minhaConta.depositar(valor);
                            System.out.println("Valor depositado com sucesso!!\n");
                            saida = 1;
                        } else {
                            System.out.println("Valor da Conta tem que ser positivo. Digite novamente.");
                            saida = 2;
                        }
                    } while (saida == 2);

                    break;
                case 2:
                    do {
                        System.out.println("\nDigite o valor que deseja sacar da Conta " + minhaConta.numero + " : ");
                        valor = entrada.nextDouble();

                        if (valor > 0 && valor < minhaConta.saldo) {
                            minhaConta.sacar(valor);
                            System.out.println("Valor sacado com sucesso!!\n");
                            saida = 1;
                        } else {
                            System.out.println("Valor insuficiente. Tente novamente.");
                            saida = 2;
                        }

                    } while (saida == 2);

                    break;
                case 3:
                    System.out.println(
                            "\nO saldo disponível é de: R$ " + minhaConta.saldo + "\nConta" + minhaConta.numero);
                    break;
                case 4:
                    System.out.println("\n\nSaindo...\n");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao < 4);

        entrada.close();
    }

}
