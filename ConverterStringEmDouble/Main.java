/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    String nome, salario1, salario2, salario3;
    double salariof1, salariof2, salariof3, media;


      System.out.println ("Informe seu nome: \n");
    Scanner scanner = new Scanner (System.in);
      nome = scanner.nextLine ();
      System.out.println ("Informe seu salario 1");
      salario1 = scanner.nextLine ();
      System.out.println ("Informe seu salario 2");
      salario2 = scanner.nextLine ();
      System.out.println ("Informe seu salario 3");
      salario3 = scanner.nextLine ();

      salario1.replaceAll (",", ".");
      salariof1 = Double.parseDouble (salario1);


      salario2.replaceAll (",", ".");
      salariof2 = Double.parseDouble (salario2);

      salario3.replaceAll (",", ".");
      salariof3 = Double.parseDouble (salario3);

      media = (salariof1 + salariof2 + salariof3) / 3;

      System.out.println ("A media do salario e de: " + media);

  }
}
