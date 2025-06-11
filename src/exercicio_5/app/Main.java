package exercicio_5.app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_5.core.Venda;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: R$ ");
        double precoUnitario = sc.nextDouble();
        
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();
        
        System.out.print("Dinheiro recebido: R$ ");
        double dinheiroRecebido = sc.nextDouble();

        Venda venda = new Venda(precoUnitario, quantidade, dinheiroRecebido);

        venda.calcularTroco();

        sc.close();
    }
}
