package clinica;

import java.util.ArrayList;
import java.util.List;

public class medico {

    private final String nome;
    private final String especialidade;
    private final List<consulta> consultas;

    public medico(String nome, String especialidade) {
        this.consultas = new ArrayList<>();
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConsulta(consulta c) {
        consultas.add(c);
    }

    public void listarPacientes() {
        System.out.println("Pacientes do Dr(a). " + nome + ":");
        consultas.forEach((c) -> {
            System.out.println("- " + c.getPaciente().getNome() + " em " + c.getData());
        });
    }

    public void listarProximasConsultas() {
        System.out.println("Próximas consultas do Dr(a). " + nome + ":");
        consultas.forEach((c) -> {
            System.out.println("- " + c.getData() + " com " + c.getPaciente().getNome());
        });
    }

    void listarpacientes() {

    }

}
