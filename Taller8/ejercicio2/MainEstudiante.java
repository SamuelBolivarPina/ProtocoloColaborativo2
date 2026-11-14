package ejercicio2;

public class MainEstudiante {
    public static void main(String[] args) {
        // Instanciamos un objeto Estudiante
        Estudiante est = new Estudiante("Samuel", 19, "MAT-2026-002");

        System.out.println(" INFORMACIÓN DEL ESTUDIANTE");
        est.mostrarDetalles();
    }
}
