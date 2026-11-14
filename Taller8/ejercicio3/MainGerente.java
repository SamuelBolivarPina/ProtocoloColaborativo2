package ejercicio3;

public class MainGerente {
    public static void main(String[] args) {
        System.out.println("DATOS DEL EMPLEADO");
        Empleado emp = new Empleado("Carlos Pérez", 1800000.0);
        emp.mostrarDetalles();

        System.out.println("DATOS DEL GERENTE");
        Gerente gerente = new Gerente("Samuel Bolívar", 3500000.0, "Ingeniería de Software");
        gerente.mostrarDetalles();
    }
}
