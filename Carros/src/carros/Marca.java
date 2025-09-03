
package carros;

import java.util.ArrayList;
import java.util.List;

public class Marca {
     private final String nome;
    private final List<Carro> carros = new ArrayList<>();

    public Marca(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public void adicionarCarro(Carro c) {
        carros.add(c);
    }

    public double mediaPreco() {
        if (carros.isEmpty()) return 0;
        double soma = 0;
        soma = carros.stream().map((c) -> c.getPreco()).reduce(soma, (accumulator, _item) -> accumulator + _item);
        return soma / carros.size();
    }

    public List<Carro> getCarros() { return carros; }

    }
