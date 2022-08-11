import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome");
        String name = scanner.nextLine();
        System.out.println("Escolha a opção");
        System.out.println("**MENU CALCULADORA**");
        System.out.println("Escolha o primeiro numero " + name);
        double number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Escolha o segundo numero");
        double number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Escolha o operador");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Dividir");
        System.out.println("4 - Multiplicara");
        int operacao = Integer.parseInt(scanner.nextLine());
        if (operacao == 1){
            double resultado = number1 + number2;
            System.out.println(name + " O resultado da sua conta é de: " + resultado);
        } else if (operacao == 2) {
            double resultado = number1 - number2;
            System.out.println(name + " O resultado da sua conta é de: " + resultado);
        } else if (operacao == 3) {
            double resultado = number1 / number2;
            System.out.println(name + " O resultado da sua conta é de: " + resultado);
        } else if (operacao == 4) {
            double resultado = number1 * number2;
            System.out.println(name + " O resultado da sua conta é de: " + resultado);
        }else{
            System.out.println("Opção não válida");
        }


    }
}
