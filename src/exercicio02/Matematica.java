package exercicio02;

public class Matematica {
    public static int soma(int a, int b){
        return a + b;
    }
public static int subtracao(int a, int b){
        return  a - b;

}

public static double divisao (int a, int b){
    if (b == 0){
        System.out.println("Erro: Divisão por zero!");
        return 0;
    }
    return  a / b;

}

public static int multiplicacao (int a, int b){
        return a * b;
}

}



