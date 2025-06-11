package exercicio_3.core;

public class Numeros {
    private int a;
    private int b;
    private int c;

    public Numeros(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void menorNumero(){
        int menor = a;
        
        if (b < menor) {
            menor = b;
        }
        
        if (c < menor) {
            menor = c;
        }
        
        System.out.println("MENOR = " + menor);
    }
}
