package appmidia;

import java.util.ArrayList;
import java.util.List;

public class publicacao {
 private final usuario autor;
    private final String conteudo;
    private final List<comentario> comentarios;

    public publicacao(usuario autor, String conteudo) {
        this.comentarios = new ArrayList<>();
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public String getConteudo() { return conteudo; }

    void adicionarcomentario(comentario c) {
    }

    public void listarComentarios() {
        if (!comentarios.isEmpty()) {
            System.out.println("Comentários:");
            comentarios.forEach((c) -> {
                System.out.println("  * " + c.getTexto() + " (por " + c.getAutor().getNome() + ")");
            });
        }
    }

  
    }

 