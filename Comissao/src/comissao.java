import java.util.Scanner;

public class comissao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de comissao de vendedores de peca");
        int IdVendedor, idPeca;
        float PrecoPeca,Quantidade,ValorComissao,PorcentagemComissao=0.05f;

        System.out.println("Informe a identificacao do vendedor:");
        IdVendedor = scanner.nextInt();

        System.out.println("Informe a identificacao da peca:");
        idPeca= scanner.nextInt();

        System.out.println("Informe o preco da peca:");
        PrecoPeca = scanner.nextFloat();

        System.out.println("Informe a quantidade de peca vendida");
        Quantidade = scanner.nextFloat();

        ValorComissao = (Quantidade*PrecoPeca) * PorcentagemComissao;

        System.out.println("A comissao e de %.2f reais\n" + ValorComissao);





    }
}
