package appmidia;

import java.util.ArrayList;
import java.util.List;

public class usuario {

    private final String nome;
    final List<publicacao> publicacoes;

    public usuario(String nome) {
        this.publicacoes = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public void criarPublicacao(String conteudo) {
        publicacao p = new publicacao(this, conteudo);
        publicacoes.add(p);
    }

    public void listarPublicacoes() {
        System.out.println("Publicações de " + nome + ":");
        publicacoes.stream().map((p) -> {
            System.out.println("- " + p.getConteudo());
            return p;
        }).forEachOrdered((p) -> {
            p.listarComentarios();
        });
    }
}
