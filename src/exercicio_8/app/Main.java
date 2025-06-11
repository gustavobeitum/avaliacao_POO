package exercicio_8.app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_8.core.ConversorTemperatura;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().toUpperCase().charAt(0);

        if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = ConversorTemperatura.celsiusParaFahrenheit(c);
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f°F\n", f);
        } else if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double f = sc.nextDouble();
            double c = ConversorTemperatura.fahrenheitParaCelsius(f);
            System.out.printf("Temperatura equivalente em Celsius: %.2f°C\n", c);
        } else {
            System.out.println("Escala inválida. Use 'C' ou 'F'.");
        }

        sc.close();
    }
}
