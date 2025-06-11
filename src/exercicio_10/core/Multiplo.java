package exercicio_10.core;

public class Multiplo {
    public static boolean verificar(int num1, int num2) {
        return (num1 % num2 == 0) || (num2 % num1 == 0);
    }
}
