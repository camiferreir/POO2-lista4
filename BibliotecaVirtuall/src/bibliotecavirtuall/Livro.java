
package bibliotecavirtuall;


public class Livro {
      private final String titulo;
    private final Autor autor;
    private int vezesEmprestado = 0;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }

    public void registrarEmprestimo() { vezesEmprestado++; }
    public int getVezesEmprestado() { return vezesEmprestado; }

    @Override
    public String toString() {
        return titulo + " por " + autor.getNome() + " | Emprestado " + vezesEmprestado + " vezes";
    }
}
