package ejercicio1;

public class MainVehiculo {
    public static void main(String[] args) {
        // Instanciamos un objeto Coche
        Coche miCoche = new Coche("Mazda", 220.0, 4);

        System.out.println(" INFORMACIÓN DEL COCHE");
        miCoche.mostrarCoche();
    }
}
