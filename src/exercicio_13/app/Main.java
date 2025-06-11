package exercicio_13.app;

import java.util.Scanner;

import exercicio_13.core.Ponto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = scanner.nextDouble();

        Ponto ponto = new Ponto(x, y);
        String resultado = ponto.localizar();

        System.out.println("Localização: " + resultado);

        scanner.close();
    }
}
