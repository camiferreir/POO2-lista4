
package clinica;


public class paciente {
    private final String nome;
    private final int idade;

    public paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
}
