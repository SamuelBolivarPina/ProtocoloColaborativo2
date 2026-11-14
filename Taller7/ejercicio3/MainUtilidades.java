package ejercicio3;

public class MainUtilidades {
    public static void main(String[] args) {
        // Al ser métodos static y public, se pueden invocar llamando directamente a la clase
        System.out.println("Suma (10 + 5) = " + Utilidades.sumar(10, 5));
        System.out.println("Resta (10 - 5) = " + Utilidades.restar(10, 5));
        System.out.println("Multiplicación (10 * 5) = " + Utilidades.multiplicar(10, 5));
        System.out.println("División (10 / 5) = " + Utilidades.dividir(10, 5));
    }
}