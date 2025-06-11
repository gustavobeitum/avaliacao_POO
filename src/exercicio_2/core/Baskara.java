package exercicio_2.core;

public class Baskara {
    private int a;
    private int b;
    private int c;

    public Baskara(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resolverEquacaoSegundoGrau() {
        if (a == 0) {
            System.out.println("Erro: O coeficiente 'a' não pode ser zero.");
            return;
        }

        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else {
            double raizDelta = Math.sqrt(delta);
            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);
            
            System.out.printf("x1 = %.4f\n", x1);
            System.out.printf("x2 = %.4f\n", x2);
        }
    }
}
