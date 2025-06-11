package exercicio_6.core;

public class Medidor {
    private double nivelGlicose;

    public Medidor(double nivelGlicose){
        this.nivelGlicose = nivelGlicose;
    }

    public void medirGlicose(){
         if (nivelGlicose <= 100) {
            System.out.println("Classificação: Normal");
        } else if (nivelGlicose <= 140) {
            System.out.println("Classificação: Elevado");
        } else {
            System.out.println("Classificação: Diabetes");
        }
    }
}
