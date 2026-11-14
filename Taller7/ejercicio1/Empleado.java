package ejercicio1;

public class Empleado {
    public String nombre; //1. propiedad nombre publica
    private double salario; // proteger salario con private

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        getSalario(salario);
    }

 public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        if (salario >= 0){
            this.salario = salario;
        }
        else{
            System.out.println("Error: El salario no puede ser negativo.");
        }
    }
}
