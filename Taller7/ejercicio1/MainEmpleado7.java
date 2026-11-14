package ejercicio1;

public class MainEmpleado7 {
    public static void main(String[] args){
        Empleado emp = new Empleado("Samuel Bolivar", 1750000);
        // acceso a (nombre) ya que es publico
        System.out.println("Empleado :" + emp.nombre);
        System.out.println("SalarioInicial : " + emp.getSalario());
        System.out.println("SalarioActual: " + emp.getSalario());
    }
}
