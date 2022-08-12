import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;

        System.out.print("Digite os anos: ");
        IdadeAnos = scanner.nextInt();

        System.out.print("Digite os meses: ");
        IdadeMeses = scanner.nextInt();

        System.out.print("Digite os dias: ");
        IdadeDias = scanner.nextInt();

        IdadeTotalDias = IdadeAnos * 360 + IdadeMeses * 30 + IdadeDias;
        System.out.print("Idade total em dias = "+IdadeTotalDias+"\n");



    }
}
