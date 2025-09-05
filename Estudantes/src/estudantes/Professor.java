package estudantes;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private final String nome;
    private final List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas ministradas pelo professor " + nome + ":");
        for (Disciplina d : disciplinas) {
            System.out.println("- " + d.getNome());
        }
    }
}
