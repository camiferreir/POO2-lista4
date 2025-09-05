package projetos;

public class Projetos {

    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("Alice");
        Desenvolvedor d2 = new Desenvolvedor("Carlos");

        Projeto p1 = new Projeto("Sistema Web");

        Tarefa t1 = new Tarefa("Criar tela de login");
        Tarefa t2 = new Tarefa("Implementar banco de dados");
        Tarefa t3 = new Tarefa("Testar API");

        t1.atribuirDesenvolvedor(d1);
        t2.atribuirDesenvolvedor(d2);
        t3.atribuirDesenvolvedor(d1);

        p1.adicionarTarefa(t1);
        p1.adicionarTarefa(t2);
        p1.adicionarTarefa(t3);

        System.out.println("Carga de trabalho do projeto: " + p1.cargaDeTrabalho() + " tarefas");
        p1.listarTarefas();

        d1.listarTarefas();
        d2.listarTarefas();

        t1.concluir();
        System.out.println("\nApós conclusão de uma tarefa:");
        p1.listarTarefas();
    }
}
