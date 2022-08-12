import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double Celsius,F;

        System.out.println("Informe o graus em Celsius");
        Celsius = scanner.nextDouble();

        F = (9 * Celsius + 160) / 5;

        System.out.println("O resultado da conversao e de: " + F);



    }
}
