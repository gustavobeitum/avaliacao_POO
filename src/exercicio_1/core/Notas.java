package exercicio_1.core;

public class Notas {
    private double nota1;
    private double nota2;

    public Notas(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return nota1 + nota2;
    }
}
