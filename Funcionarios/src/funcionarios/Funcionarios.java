package funcionarios;

public class Funcionarios {

    public static void main(String[] args) {
    Funcionario f1 = new Funcionario("Ana", 3000);
        Funcionario f2 = new Funcionario("Carlos", 4000);

        Departamento d1 = new Departamento("TI");
        d1.adicionarFuncionario(f1);
        d1.adicionarFuncionario(f2);

        projeto p1 = new projeto("Sistema Interno");
        p1.adicionarFuncionario(f1);

        System.out.println("Média salarial TI: " + d1.mediaSalarial());
        p1.listarEquipe();
    }
}
    