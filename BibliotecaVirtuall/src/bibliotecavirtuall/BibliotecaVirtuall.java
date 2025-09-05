
package bibliotecavirtuall;

import java.time.LocalDate;

public class BibliotecaVirtuall {

    public static void main(String[] args) {
        Autor a1 = new Autor("Coolen Hoover");
        Autor a2 = new Autor("Raphael Montes");

        Livro l1 = new Livro("É assim que acaba", a1);
        Livro l2 = new Livro("Dias perfeitos", a2);

        Usuario u1 = new Usuario("Alice");
        Usuario u2 = new Usuario("Bob");

        Emprestimo e1 = new Emprestimo(u1, l1);
        Emprestimo e2 = new Emprestimo(u2, l2);

        u1.listarEmprestimos();
        u2.listarEmprestimos();

      
        LocalDate hoje = LocalDate.now().plusDays(10);
        System.out.println("Multa de Alice: R$" + e1.calcularMulta(hoje));

       
        System.out.println("Livros mais populares:");
        System.out.println(l1);
        System.out.println(l2);
    }
}
    