package passagens;

import java.util.ArrayList;
import java.util.List;

public class Voo {
private final String numero;
    private final int capacidade;
    private final List<Reserva> reservas;

    public Voo(String numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.reservas = new ArrayList<>();
    }


    public String getNumero() { return numero; }
    public int getCapacidade() { return capacidade; }
    public List<Reserva> getReservas() { return reservas; }

    public boolean verificarDisponibilidade() {
        return reservas.size() < capacidade;
    }

    public void adicionarReserva(Reserva r) {
        if(verificarDisponibilidade()) {
            reservas.add(r);
        } else {
            System.out.println("Voo lotado: " + numero);
        }
    }
}