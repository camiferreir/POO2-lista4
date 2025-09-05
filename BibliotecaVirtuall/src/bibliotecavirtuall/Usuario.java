
package bibliotecavirtuall;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final String nome;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void adicionarEmprestimo(Emprestimo e) { emprestimos.add(e); }

    public void listarEmprestimos() {
        System.out.println("Empréstimos de " + nome + ":");
        for (Emprestimo e : emprestimos) {
            System.out.println("- " + e.getLivro().getTitulo());
        }
    }
}
