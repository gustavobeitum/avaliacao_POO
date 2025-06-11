package exercicio_11.app;

import java.util.Scanner;

import exercicio_11.core.Salario;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa: ");
        double salarioAtual = sc.nextDouble();

        Salario salario = new Salario(salarioAtual);

        System.out.printf("Novo salário: R$ %.2f%n", salario.getNovoSalario());
        System.out.printf("Aumento: R$ %.2f%n", salario.getAumento());
        System.out.printf("Porcentagem: %.0f%%%n", salario.getPorcentagemAumento());

        sc.close();
    }
}
