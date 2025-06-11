package exercicio_10.app;

import java.util.Scanner;

import exercicio_10.core.Multiplo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (Multiplo.verificar(num1, num2)) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
