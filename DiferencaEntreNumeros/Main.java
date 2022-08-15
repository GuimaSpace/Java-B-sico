import java.util.*;
import java.util.Scanner;



public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2,Diferenca;
        System.out.println("Informe o numero 1");
        numero1 = scanner.nextInt();
        System.out.println("Informe o numero 2");
        numero2 = scanner.nextInt();
        
        System.out.println("A diferenca entre os numeros é de: ");
        Diferenca = numero1 - numero2;
        
        System.out.println("A diferenca entre os numero e de: " + Diferenca);
        
        
	}
}
