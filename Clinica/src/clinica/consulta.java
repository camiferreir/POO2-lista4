package clinica;

public class consulta {

    private medico medico;
    private paciente paciente;
    private String data;

    public consulta(medico ml, paciente p1, String _1000) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    public paciente getPaciente() {
        return paciente;
    }

    public String getData() {
        return data;
    }
}
