package ejercicio3;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " | Salario: " + salario);
    }
}
