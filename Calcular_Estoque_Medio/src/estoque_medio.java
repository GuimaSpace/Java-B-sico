import java.util.Scanner;

public class estoque_medio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double quantidade_minima, quantidade_maxima,estoque_medio;

        System.out.println("Informe a quantidade de entrada minima");
        quantidade_minima = entrada.nextDouble();
        System.out.println("Informe a quantidade de entrada maxima");
        quantidade_maxima = entrada.nextDouble();

        estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
        System.out.println("A quantidade de estoque médio é de: " + estoque_medio);


    }
}
