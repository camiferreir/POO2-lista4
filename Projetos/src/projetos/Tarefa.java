package projetos;

public class Tarefa {

    private final String descricao;
    private String status;
    private Desenvolvedor responsavel;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = "Pendente";
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public Desenvolvedor getResponsavel() {
        return responsavel;
    }

    public void atribuirDesenvolvedor(Desenvolvedor d) {
        this.responsavel = d;
        d.adicionarTarefa(this);
    }

    public void concluir() {
        this.status = "Concluída";
    }

}
