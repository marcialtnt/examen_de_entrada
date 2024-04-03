package marcial.ascencio.vilca.examen_de_entrada;

import marcial.ascencio.vilca.examen_de_entrada.model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        System.out.println("Iniciando aplicación...");
        empleados.add(
            new Gerente(
                1,
                "Christy Prangnell",
                Departamento.GERENCIA, (float)2000.0,
                new ArrayList<>(
                    Arrays.asList(
                        new Gerente(2,
                            "Orsola Sancto",
                            Departamento.GERENCIA,
                            (float)2000.0,
                            new ArrayList<>(
                                Arrays.asList(
                                    new Desarrollador(
                                        3,
                                        "Justinn Bartel",
                                        Departamento.DESARROLLO,
                                        (float)1000.0,
                                        new ArrayList<>(
                                            Arrays.asList(Lenguaje.JAVA, Lenguaje.PHP)
                                        )
                                    ),
                                    new Gerente(4,
                                        "Nikkie Alven",
                                        Departamento.GERENCIA,
                                        (float)1000.0,
                                        new ArrayList<>(
                                            Arrays.asList(
                                                new Desarrollador(
                                                    5,
                                                    "Claudia Ameer-Beg",
                                                    Departamento.DESARROLLO,
                                                    (float)1000.0,
                                                    new ArrayList<>(
                                                        Arrays.asList(Lenguaje.JAVA, Lenguaje.VBA, Lenguaje.C_CPLUSPLUS, Lenguaje.JAVASCRIPT, Lenguaje.TYPESCRIPT)
                                                    )
                                                ),
                                                new Desarrollador(
                                                    6,
                                                    "Janith Mont",
                                                    Departamento.DESARROLLO,
                                                    (float)1000.0,
                                                    new ArrayList<>(
                                                        Arrays.asList(Lenguaje.JAVA)
                                                    )
                                                ),
                                                new Desarrollador(
                                                    7,
                                                    "Alf Feldheim",
                                                    Departamento.DESARROLLO,
                                                    (float)1000.0,
                                                    new ArrayList<>(
                                                        Arrays.asList(Lenguaje.JAVA, Lenguaje.C_SHARP, Lenguaje.MATLAB)
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                        ),
                        new Gerente(8,
                            "Ellie Lermouth",
                            Departamento.GERENCIA,
                            (float)2000.0,
                            new ArrayList<>(
                                Arrays.asList(
                                    new Gerente(9,
                                        "Moise Maker",
                                        Departamento.GERENCIA,
                                        (float)2000.0,
                                        new ArrayList<>(
                                            Arrays.asList(
                                                new Desarrollador(
                                                    10,
                                                    "Corbett Scotney",
                                                    Departamento.DESARROLLO,
                                                    (float)1000.0,
                                                    new ArrayList<>(
                                                        Arrays.asList(Lenguaje.JAVA, Lenguaje.PYTHON)
                                                    )
                                                ),
                                                new Desarrollador(
                                                    11,
                                                    "Bartie Poe",
                                                    Departamento.DESARROLLO,
                                                    (float)1000.0,
                                                    new ArrayList<>(
                                                        Arrays.asList(Lenguaje.JAVA)
                                                    )
                                                ),
                                                new Desarrollador(
                                                    12,
                                                    "Kittie Eldrid",
                                                    Departamento.DESARROLLO,
                                                    (float)1000.0,
                                                    new ArrayList<>(
                                                        Arrays.asList(Lenguaje.JAVA, Lenguaje.PERL, Lenguaje.DELPHI_PASCAL, Lenguaje.COBOL, Lenguaje.SWIFT, Lenguaje.DART, Lenguaje.KOTLIN)
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                        ),
                        new Gerente(13,
                            "Opalina Biernacki",
                            Departamento.GERENCIA,
                            (float)2000.0,
                            new ArrayList<>(
                                Arrays.asList(
                                    new Desarrollador(14,
                                        "Nanny Middleditch",
                                        Departamento.DESARROLLO,
                                        (float)2000.0,
                                        new ArrayList<>(
                                            Arrays.asList(Lenguaje.JAVA)
                                        )
                                    ),
                                    new Gerente(15,
                                        "Lisle Shalloo",
                                        Departamento.GERENCIA,
                                        (float)2000.0,
                                        new ArrayList<>(
                                            Arrays.asList(
                                                new Desarrollador(16,
                                                    "Burk McAne",
                                                    Departamento.DESARROLLO,
                                                    (float)1000.0,
                                                    new ArrayList<>(
                                                        Arrays.asList(Lenguaje.JAVA, Lenguaje.POWERSHELL)
                                                    )
                                                ),
                                                new Desarrollador(17,
                                                    "Susana Andrzej",
                                                    Departamento.DESARROLLO,
                                                    (float)1000.0,
                                                    new ArrayList<>(
                                                       Arrays.asList(Lenguaje.JAVA, Lenguaje.LUA, Lenguaje.HASKELL)
                                                    )
                                                ),
                                                new Desarrollador(18,
                                                    "Oralia Ericssen",
                                                    Departamento.DESARROLLO,
                                                    (float)1000.0,
                                                    new ArrayList<>(
                                                        Arrays.asList(Lenguaje.JAVA, Lenguaje.JAVASCRIPT)
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                        )
                    )
                )
            )
        );
        // Iterar sobre la lista de empleados y mostrar sus detalles:
        int indent = 0;
        empleados.get(0).mostrarDetalles(indent++);
        // Calcular y mostrar el bono de cada empleado al final del año:
        System.out.println("-".repeat(100));
        System.out.println("Estos son los bonos de fin de año:");
        System.out.println("-".repeat(100));
        System.out.println(String.format("%02d", empleados.get(0).getId()) + "." +
                String.format("=%-" + 30 + "s", empleados.get(0).getNombre()).replaceAll("\\s(?=\\s+$|$)", " ") +
                " Bono -> " + String.format("%9.2f", empleados.get(0).calcularBono()));
        calcularBonoEquipo((Gerente)empleados.get(0));
        // Demostración del polimorfismo con el método evaluación de desempeño:
        System.out.println("-".repeat(100));
        System.out.println("Resultados de la evaluación de desempeño:");
        System.out.println("-".repeat(100));
        System.out.println(String.format("%02d", empleados.get(0).getId()) + "." +
                String.format("=%-" + 30 + "s", empleados.get(0).getNombre()).replaceAll("\\s(?=\\s+$|$)", " ") +
                " Desempeño -> " + String.format("%10s", ((Gerente) empleados.get(0)).evaluarDesempeno()));
        calcularDesempenoEquipo((Gerente)empleados.get(0));
    };

    static void calcularBonoEquipo(Gerente gerente) {
        for (Empleado empleado : gerente.getEquipo()) {
            int length = 30;
            String inputString = empleado.getNombre();
            String paddedString = String.format("=%-" + length + "s", inputString).replaceAll("\\s(?=\\s+$|$)", " ");
            String bonoStr = String.format("%9.2f", empleado.calcularBono());
            System.out.println(String.format("%02d", empleado.getId()) + "." + paddedString + " Bono -> " + bonoStr);
            if (empleado.getClass() == Gerente.class) {
                calcularBonoEquipo((Gerente)empleado);
            }
        }
    }

    static void calcularDesempenoEquipo(Gerente gerente) {
        for (Empleado empleado : gerente.getEquipo()) {
            int length = 30;
            String inputString = empleado.getNombre();
            String paddedString = String.format("=%-" + length + "s", inputString).replaceAll("\\s(?=\\s+$|$)", " ");
            String desempeno = String.format("%10s", empleado.evaluarDesempeno());
            System.out.println(String.format("%02d", empleado.getId()) + "." + paddedString + " Desempeño -> " + desempeno);
            if (empleado.getClass() == Gerente.class) {
                calcularDesempenoEquipo((Gerente)empleado);
            }
        }
    }
}