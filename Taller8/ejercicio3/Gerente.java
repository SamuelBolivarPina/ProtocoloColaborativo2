package ejercicio3;

public class Gerente extends Empleado {
    // Atributo específico de la clase Gerente
    public String departamento;

    // Constructor de Gerente
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llama al constructor de la clase base
        this.departamento = departamento;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles(); // Muestra el nombre y salario del padre[cite: 15, 17]
        System.out.println("Departamento: " + departamento);
    }
}
