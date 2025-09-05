package projetos;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

    private final String nome;
    private final List<Tarefa> tarefas = new ArrayList<>();

    public Projeto(String nome) {
        this.nome = nome;
    }

    public void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    public int cargaDeTrabalho() {
        return tarefas.size();
    }

    public void listarTarefas() {
        System.out.println("Tarefas do projeto " + nome + ":");
        tarefas.forEach((t) -> {
            System.out.println("- " + t.getDescricao() + " (Status: " + t.getStatus() + ")");
        });
    }

}
