package exercicio_1.app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_1.core.Notas;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 =  sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 =  sc.nextDouble();

        Notas mediaAluno1 = new Notas(nota1, nota2);

        double media = mediaAluno1.calcularMedia();

        if(media >= 60){
            System.out.printf("NOTA FINAL: %.2f", media);
        } else{
            System.out.println("REPROVADO");
        }
        

        sc.close();

    }
}
