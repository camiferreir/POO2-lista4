package estudantes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {

    private final String nome;
    private final Professor professor;
    private final List<Estudante> estudantes = new ArrayList<>();
    private final Map<Estudante, Double> notas = new HashMap<>();

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        professor.adicionarDisciplina(this);
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEstudante(Estudante e) {
        estudantes.add(e);
    }

    public void atribuirNota(Estudante e, double nota) {
        notas.put(e, nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }
        double soma = 0;
        soma = notas.values().stream().map((nota) -> nota).reduce(soma, (accumulator, _item) -> accumulator + _item);
        return soma / notas.size();
    }

    public void listarEstudantes() {
        System.out.println("Estudantes matriculados em " + nome + ":");
        estudantes.forEach((e) -> {
            System.out.println("- " + e.getNome());
        });
    }
}
