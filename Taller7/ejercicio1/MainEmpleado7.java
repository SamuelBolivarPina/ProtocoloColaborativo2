package ejercicio1;

public class MainEmpleado7 {
    public static void main(String[] args){
        Empleado emp = new Empleado("Samuel Bolivar", 1750000);
        // acceso a (nombre) ya que es publico
        System.out.println("Empleado :" + emp.nombre);
        // acceso al salario usando metodo get
        System.out.println("SalarioInicial : " + emp.getSalario());
        // Modificacion del salario usando metodo set de validacion
        emp.setSalario(3500000);
        System.out.println("SalarioActual: " + emp.getSalario());
    }
}
