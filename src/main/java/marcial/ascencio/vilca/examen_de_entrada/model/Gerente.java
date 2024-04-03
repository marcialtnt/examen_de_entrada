package marcial.ascencio.vilca.examen_de_entrada.model;

import marcial.ascencio.vilca.examen_de_entrada.util.Constantes;

import java.util.ArrayList;

public class Gerente extends Empleado implements IEvaluacionDesempeno {
    ArrayList<Empleado> equipo;
    public Gerente(int id, String nombre, Departamento departamento, float salario, ArrayList<Empleado> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }

    public Gerente(int id, String nombre, Departamento departamento, float salario) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }

    public void agregarIntegrante(Empleado empleado) {
        equipo.add(empleado);
    }
    @Override
    public void mostrarDetalles(int indent) {
        super.mostrarDetalles(indent);
        System.out.print(" ".repeat((indent) * 3) + "|");
        System.out.println("Desempeño: " + this.evaluarDesempeno());
        int length = 100;
        String inputString = "Equipo de " + this.nombre + ": (" + contarIntegrantesDelEquipo() + " integrantes)";
        String paddedString = String.format("%-" + (length  - 1 - indent * 3)+ "s", inputString).replaceAll("\\s(?=\\s+$|$)", "-");
        System.out.print(" ".repeat((indent) * 3) + "|");
        System.out.println(paddedString);
        int oldIndent = indent;
        indent++;
        for (Empleado integrante : equipo) {
            integrante.mostrarDetalles(indent);
        }
        System.out.print(" ".repeat((oldIndent) * 3));
        inputString = "Fin equipo de " + this.nombre;
        paddedString = String.format("=%-" + (length  - 1 - oldIndent * 3)+ "s", inputString).replaceAll("\\s(?=\\s+$|$)", "=");
        System.out.println(paddedString);
    };

    @Override
    public String evaluarDesempeno() {
        // Para fines de prueba definimos una función arbitraria en baase al id del empleado
        return (Desempeno.values()[(this.id - 1) / 6].name());
    }

    @Override
    public float calcularBono() {
        // Calculado en base al desempeño y al tipo de empleado
        // Para gerentes es el 100% del bono total
        // Además, el Bono está basado al número de personas a su cargo
        // Ejm: 10% del total del bono total por cada persona adicional.
        float bono = 0f;
        if (this.evaluarDesempeno().equals(Desempeno.BUENO.name())) {
            bono = Constantes.BONO;
        } else if (this.evaluarDesempeno().equals(Desempeno.REGULAR.name())) {
            bono = Constantes.BONO * 0.5f;
        }
        // El máximo de personal será 10 para alcanzar el 100%
        int maxPersonalACargoBono = Math.min((this.contarIntegrantesDelEquipo()), 10);
        return (bono * maxPersonalACargoBono / 10.0f);
    }

    int contarIntegrantesDelEquipo() {
        int conteo = 0;
        for (Empleado empleado : equipo) {
            if (empleado.getClass() == Desarrollador.class) {
                conteo++;
            }
            else {
                Gerente gerente = (Gerente)empleado;
                conteo++;
                conteo += gerente.contarIntegrantesDelEquipo();
            }
        }
        return (conteo);
    }

    public ArrayList<Empleado> getEquipo() {
        return equipo;
    }
}
