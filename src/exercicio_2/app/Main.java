package exercicio_2.app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_2.core.Baskara;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        int a = sc.nextInt();
        
        System.out.print("Coeficiente b: ");
        int b = sc.nextInt();
        
        System.out.print("Coeficiente c: ");
        int c = sc.nextInt();

        Baskara equacao = new Baskara(a, b, c);

        equacao.resolverEquacaoSegundoGrau();

        sc.close();
    }
}
