package projetos;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {

    private final String nome;
    private final List<Tarefa> tarefas = new ArrayList<>();

    public Desenvolvedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    public void listarTarefas() {
        System.out.println("Tarefas do desenvolvedor " + nome + ":");
        tarefas.forEach((t) -> {
            System.out.println("- " + t.getDescricao() + " (Status: " + t.getStatus() + ")");
        });

    }
}
