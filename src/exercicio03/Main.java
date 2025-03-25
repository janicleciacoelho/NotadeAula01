package exercicio03;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("Digite o nome do produto:");
        p.setNome(sc.nextLine());

        System.out.print("Digite o preço do produto: ");
        p.setPreco(sc.nextDouble());

        System.out.print("Digite a quantidade inicial em estoque: ");
        p.setQuantidadeEstoque(sc.nextInt());

        int opcao;
        do{
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Exibir estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.print("Quantidade a adicionar: ");
                    int add = sc.nextInt();
                    p.adicionarEstoque(add);
                    break;
                case 2:
                    System.out.print("Quantidade a vender: ");
                    int sell = sc.nextInt();
                    p.venderProduto(sell);
                    break;
                case 3:
                    p.exibirEstoque();
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
