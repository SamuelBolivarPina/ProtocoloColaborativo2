package ejercicio1;

public class Coche extends Vehiculo{
    public int numeroPuertas;
    public Coche(String marca,double velocidadMaxima,int numeroPuertas){
        super(marca,velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }
}
