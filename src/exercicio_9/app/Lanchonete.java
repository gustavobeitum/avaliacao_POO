package exercicio_9.app;

import java.util.Scanner;

import exercicio_9.core.Produto;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = {
            new Produto(1, 5.00),
            new Produto(2, 3.50),
            new Produto(3, 4.80),
            new Produto(4, 8.90),
            new Produto(5, 7.32)
        };

        System.out.println("===== CARDÁPIO =====");
        for (Produto p : produtos) {
            System.out.printf("Código: %d - R$ %.2f%n", p.getCodigo(), p.getPreco());
        }

        System.out.print("Código do produto comprado: ");
        int codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        if (codigo < 1 || codigo > 5) {
            System.out.println("Código inválido.");
            return;
        }

        Produto produtoEscolhido = produtos[codigo - 1];
        double total = produtoEscolhido.getPreco() * quantidade;

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
