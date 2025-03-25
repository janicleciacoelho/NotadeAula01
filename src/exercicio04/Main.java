package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria();
        ContaBancaria contaDestino = new ContaBancaria();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    minhaConta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    double deposito = sc.nextDouble();
                    minhaConta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    double saque = sc.nextDouble();
                    minhaConta.sacar(saque);
                    break;
                case 4:
                    System.out.print("Valor da transferência: ");
                    double transferencia = sc.nextDouble();
                    minhaConta.transferir(contaDestino, transferencia);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);


    }
}




