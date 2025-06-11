package exercicio_6.app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_6.core.Medidor;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double nivelGlicose = sc.nextDouble();

        Medidor medidor = new Medidor(nivelGlicose);

        medidor.medirGlicose();
        
        sc.close();
    }
}
