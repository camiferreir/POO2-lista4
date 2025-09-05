package estudantes;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

    private final String nome;
    private final List<Disciplina> disciplinas = new ArrayList<>();

    public Estudante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void matricular(Disciplina d) {
        disciplinas.add(d);
        d.adicionarEstudante(this);
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas do estudante " + nome + ":");
        disciplinas.forEach((d) -> {
            System.out.println("- " + d.getNome());
        });
    }
}
