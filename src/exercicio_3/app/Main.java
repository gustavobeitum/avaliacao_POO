package exercicio_3.app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_3.core.Numeros;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int a = sc.nextInt();
        
        System.out.print("Segundo valor: ");
        int b = sc.nextInt();
        
        System.out.print("Terceiro valor: ");
        int c = sc.nextInt();

        Numeros numeros = new Numeros(a, b, c);

        numeros.menorNumero();

        sc.close();
    }
}
