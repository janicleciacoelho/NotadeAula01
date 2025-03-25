package exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Escolha uma operação:");
        System.out.println(" 1- Soma\n2- Subtrai\n3- Divide\n4- Multiplica");
        int opcao = sc.nextInt();

        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Resultado:" + Matematica.soma(num1, num2));
                break;

            case 2:
                System.out.println("Resultado:" + Matematica.subtracao(num1, num2));
                break;

            case 3:
                System.out.println("Resultado:" + Matematica.divisao(num1, num2));
                break;

            case 4:
                System.out.println("Resultado:" + Matematica.multiplicacao(num1, num2));
                break;

            default:
                System.out.println("Opção inválida!");

        }



    }



}
