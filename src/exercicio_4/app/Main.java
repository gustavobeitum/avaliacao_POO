package exercicio_4.app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_4.core.Telefonia;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos consumidos: ");
        int minutos = sc.nextInt();

        Telefonia plano = new Telefonia(minutos);

        plano.calcularMinutos();

        sc.close();
    }
}
