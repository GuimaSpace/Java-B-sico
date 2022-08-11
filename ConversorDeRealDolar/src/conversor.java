import java.util.Scanner;

public class conversor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double cotacao_dolar, real, valor_final;

        System.out.println("Informe a cotacao do dolar atual:");
        cotacao_dolar = scanner.nextDouble();
        System.out.println("Informe o real:");
        real = scanner.nextDouble();

        valor_final = real/cotacao_dolar;

        System.out.println("O valor da conversão e de: " + valor_final);


    }
}
