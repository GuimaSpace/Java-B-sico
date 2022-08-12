import java.util.Scanner;


public class calcularlitro {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double VelocidadeMedia, TempoGasto, Distancia, LITROS_USADOS, Autonomia = 12;
        System.out.println("Informe a velocidade media do veiculo");
        VelocidadeMedia = scanner.nextDouble();
        System.out.println("Informe o tempo gasto * DIAS");
        TempoGasto = scanner.nextDouble();
        Distancia = VelocidadeMedia*TempoGasto;
        LITROS_USADOS = Distancia/Autonomia;
        System.out.println("STATUS");
        System.out.println("O carro usou: " + LITROS_USADOS + "Litros " + " em uma corrida de\n " + Distancia + "KM");



    }
}
