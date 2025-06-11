package exercicio_11.core;

public class Salario {
    private double salarioAtual;
    private double aumento;
    private double novoSalario;
    private double porcentagemAumento;

    public Salario(double salarioAtual) {
        this.salarioAtual = salarioAtual;
        calcularAumento();
    }

    private void calcularAumento() {
        if (salarioAtual <= 1000.00) {
            aumento = salarioAtual * 0.20;
            porcentagemAumento = 20.0;
        } else if (salarioAtual <= 3000.00) {
            aumento = salarioAtual * 0.15;
            porcentagemAumento = 15.0;
        } else if (salarioAtual <= 8000.00) {
            aumento = salarioAtual * 0.10;
            porcentagemAumento = 10.0;
        } else {
            aumento = salarioAtual * 0.05;
            porcentagemAumento = 5.0;
        }
        novoSalario = salarioAtual + aumento;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public double getAumento() {
        return aumento;
    }

    public double getPorcentagemAumento() {
        return porcentagemAumento;
    }
}
