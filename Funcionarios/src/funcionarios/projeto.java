package funcionarios;

import java.util.ArrayList;
import java.util.List;

public class projeto {
  private final String nome;
    private final List<Funcionario> equipe = new ArrayList<>();

    public projeto(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        equipe.add(f);
    }

    public void listarEquipe() {
        System.out.println("Equipe do projeto " + nome + ":");
        equipe.forEach((f) -> {
            System.out.println(f.getNome());
      });
    }
}
