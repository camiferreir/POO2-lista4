package passagens;

public class Reserva {

    private final Passageiro passageiro;
    private final Voo voo;

    public Reserva(Passageiro passageiro, Voo voo) {
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public Passageiro getPassageiro() { return passageiro; }
    public Voo getVoo() { return voo; }
}