
package bibliotecavirtuall;

import java.time.LocalDate;

public class Emprestimo {
     private final Usuario usuario;
    private final Livro livro;
    private final LocalDate dataEmprestimo;
    private final LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(7); // prazo padrão 7 dias
        usuario.adicionarEmprestimo(this);
        livro.registrarEmprestimo();
    }

    public Livro getLivro() { return livro; }

    public double calcularMulta(LocalDate dataAtual) {
        if (dataAtual.isAfter(dataDevolucao)) {
            long diasAtraso = java.time.temporal.ChronoUnit.DAYS.between(dataDevolucao, dataAtual);
            return diasAtraso * 2; // multa R$2 por dia
        }
        return 0;
    }
}
