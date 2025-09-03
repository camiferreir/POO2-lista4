
package clinica;

public class Clinica {

    public static void main(String[] args) {
        medico m1 = new medico("Carlos", "Cardiologia");
        medico m2 = new medico("Ana", "Dermatologia");

        paciente p1 = new paciente("João", 40);
        paciente p2 = new paciente("Maria", 30);

        consulta consulta = new consulta(m1, p1, "05/09/2025 10:00");
        consulta consulta1 = new consulta(m1, p2, "06/09/2025 14:00");


        m1.listarpacientes();
        m1.listarProximasConsultas();
        m2.listarProximasConsultas();
    }
}
   