package marcial.ascencio.vilca.examen_de_entrada.model;

import lombok.Getter;

public abstract class Empleado {
    @Getter
    int id;
    protected String nombre;
    Departamento departamento;
    float salario;

    public Empleado(int id, String nombre, Departamento departamento, float salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", departamento=" + departamento +
                ", salario=" + salario +
                '}';
    }

    public void mostrarDetalles(int indent) {
        String cad = String.format("%s", this.toString());
        System.out.print(" ".repeat((indent) * 3) + "|");
        System.out.println(cad);
        // this.toString()
    }

    public abstract float calcularBono();

    public abstract String evaluarDesempeno();
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
}
