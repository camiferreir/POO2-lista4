package appmidia;

public class AppMidia {

    public static void main(String[] args) {
usuario u1 = new usuario("Alice");
        usuario u2 = new usuario("Bob");

        u1.criarPublicacao("Olá, pessoal!");
        u1.criarPublicacao("Adorei o filme que vi ontem.");

        publicacao p1 = u1.publicacoes.get(0);
        p1.adicionarcomentario(new comentario(u2, "Que legal!"));

        u1.listarPublicacoes();
    }
}
    