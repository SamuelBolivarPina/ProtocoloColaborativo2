package ejercicio2;

public class Estudiante extends Persona {
    public String matricula;
public Estudiante(String nombre, int edad, String matricula){
    super(nombre,edad);
    this.matricula = matricula;
}
}
