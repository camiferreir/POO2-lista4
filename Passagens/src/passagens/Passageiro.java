package passagens;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {

       private final String nome;
    private final List<Reserva> reservas;

    public Passageiro(String nome) {
        this.nome = nome;
        this.reservas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Reserva> getReservas() { return reservas; }

    public void adicionarReserva(Reserva r) {
        reservas.add(r);
    }

    Object getReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
