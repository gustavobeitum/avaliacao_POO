package exercicio_12.core;

public class Jogo {
    private int horaInicial;
    private int horaFinal;

    public Jogo(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public int calcularDuracao() {
        if (horaInicial < horaFinal) {
            return horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) {
            return (24 - horaInicial) + horaFinal;
        } else {
            return 24;
        }
    }
}
