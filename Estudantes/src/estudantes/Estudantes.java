package estudantes;

public class Estudantes {

    public static void main(String[] args) {
        Professor prof1 = new Professor("Marcos");
        Professor prof2 = new Professor("Ana");

        Disciplina d1 = new Disciplina("Programação", prof1);
        Disciplina d2 = new Disciplina("Matemática", prof2);

        Estudante e1 = new Estudante("João");
        Estudante e2 = new Estudante("Maria");

        e1.matricular(d1);
        e2.matricular(d1);
        e2.matricular(d2);

        d1.atribuirNota(e1, 8.5);
        d1.atribuirNota(e2, 9.0);

        e1.listarDisciplinas();
        e2.listarDisciplinas();

        prof1.listarDisciplinas();
        prof2.listarDisciplinas();

        d1.listarEstudantes();
        System.out.println("Média da disciplina " + d1.getNome() + ": " + d1.calcularMedia());
    }
}
