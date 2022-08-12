import java.util.Scanner;

public class ConversorFahrenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double F,C;
        System.out.println("Insira o valor em Fahrenheit");
        F = scanner.nextDouble();

        C = (F - 32) * 5 / 9;
        System.out.println("O grau em celsius é de: " + C);




    }
}
