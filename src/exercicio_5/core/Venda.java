package exercicio_5.core;

public class Venda {
    private double precoUnitario;
    private int quantidade;
    private double dinheiroRecebido;

    public Venda(double precoUnitario, int quantidade, double dinheiroRecebido){
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public void calcularTroco(){
        double totalCompra = precoUnitario * quantidade;
        
        if (dinheiroRecebido >= totalCompra) {
            double troco = dinheiroRecebido - totalCompra;
            System.out.printf("TROCO = R$ %.2f%n", troco);
        } else {
            double falta = totalCompra - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f%n", falta);
        }
    }
}
