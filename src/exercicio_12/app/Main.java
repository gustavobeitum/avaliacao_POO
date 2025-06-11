package exercicio_12.app;

import java.util.Scanner;

import exercicio_12.core.Jogo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.print("Digite a hora final: ");
        int horaFinal = sc.nextInt();

        Jogo jogo = new Jogo(horaInicial, horaFinal);

        int duracao = jogo.calcularDuracao();

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        sc.close();
    }
}