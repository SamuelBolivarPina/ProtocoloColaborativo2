package ejercicio1;

public class Coche extends Vehiculo{
    private int numeroPuertas;
    public Coche(String marca,double velocidadMaxima,int numeroPuertas){
        super(marca,velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }
    public void mostrarCoche(){
        motrarInformacion();
        System.out.println("Número de Puertas :" + numeroPuertas);
    }
}
