package exercicio_4.core;

public class Telefonia {
    private int minutos;

    public Telefonia(int minutos){
        this.minutos = minutos;
    }

    public void calcularMinutos(){
        double valorAPagar;
        if (minutos <= 100) {
            valorAPagar = 50.00;
        } else {
            int minutosExcedentes = minutos - 100;
            valorAPagar = 50.00 + (minutosExcedentes * 2.00);
        }
        System.out.printf("Valor a pagar: R$ %.2f", valorAPagar);
    }
        
}
