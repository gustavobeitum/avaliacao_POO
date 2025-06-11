package exercicio_7.core;

public class Lancamento {
    private double distancia1;
    private double distancia2;
    private double distancia3;

    public Lancamento(double distancia1, double distancia2, double distancia3){
        this.distancia1 = distancia1;
        this.distancia2 = distancia2;
        this.distancia3 = distancia3;
    }

    public void medirLancamento(){
        double maior = distancia1;
        
        if (distancia2 > maior) {
            maior = distancia2;
        }
        
        if (distancia3 > maior) {
            maior = distancia3;
        }
        System.out.printf("MAIOR DISTÂNCIA = %.2f metros%n", maior);
    }
}
