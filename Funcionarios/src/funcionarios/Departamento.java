package funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
     private final String nome;
    private final List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public double mediaSalarial() {
        double soma = 0;
        for (Funcionario f : funcionarios) soma += f.getSalario();
        return funcionarios.isEmpty() ? 0 : soma / funcionarios.size();
    }
}
