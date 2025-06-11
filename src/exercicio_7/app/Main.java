package exercicio_7.app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_7.core.Lancamento;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Primeiro lançamento: ");
        double primeiro = sc.nextDouble();
        
        System.out.print("Segundo lançamento: ");
        double segundo = sc.nextDouble();
        
        System.out.print("Terceiro lançamento: ");
        double terceiro = sc.nextDouble();

        Lancamento lancador1 = new Lancamento(primeiro, segundo, terceiro);

        lancador1.medirLancamento();

        sc.close();
    }
}
