package appmidia;

public class comentario {

  
private final usuario autor;
    private final String texto;

    public comentario(usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public usuario getAutor() { return autor; }
    public String getTexto() { return texto; }
}

