package marcial.ascencio.vilca.examen_de_entrada.model;

import marcial.ascencio.vilca.examen_de_entrada.util.Constantes;

import java.util.ArrayList;

public class Desarrollador extends Empleado implements IEvaluacionDesempeno{
    ArrayList<Lenguaje> lenguajes;
    public Desarrollador(int id, String nombre, Departamento departamento, float salario,  ArrayList<Lenguaje> lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes = lenguajes;
    }

    public Desarrollador(int id, String nombre, Departamento departamento, float salario) {
        super(id, nombre, departamento, salario);
    }

    @Override
    public void mostrarDetalles(int indent) {
        super.mostrarDetalles(indent);
        System.out.print(" ".repeat((indent) * 3) + "|");
        System.out.println("Desempeño: " + this.evaluarDesempeno());
        System.out.print(" ".repeat((indent) * 3) + "|");
        System.out.print("Lenguajes: ");
        for (Lenguaje lenguaje : lenguajes) {
            System.out.print(lenguaje.name() + ", ");
        }
        System.out.println();
        System.out.print(" ".repeat((indent) * 3) + "|");
        System.out.println("Bono:" + this.calcularBono());
    }

    @Override
    public String evaluarDesempeno() {
        return (Desempeno.values()[(this.id - 1) / 6].name());
    }

    @Override
    public float calcularBono() {
        // Calculado en base al desempeño y al tipo de empleado
        // Para desarrolladores es el 50% del bono total
        // Además, el Bono está amarrado al número de lenguajes que el desarrollador conoce
        // Ejm: 10% del total del bono total por cada lenguaje adicional.
        float bono = 0f;
        if (this.evaluarDesempeno().equals(Desempeno.BUENO.name())) {
            bono = Constantes.BONO * 0.5f;
        } else if (this.evaluarDesempeno().equals(Desempeno.REGULAR.name())) {
            bono = Constantes.BONO * 0.5f * 0.5f;
        }
        int maxLenguajesBono = Math.min(this.lenguajes.size(), 10);
        return (bono * (maxLenguajesBono - 1) / 10.0f);
    }
}
