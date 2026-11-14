package ejercicio2;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    // Métodos públicos get y set para saldo
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
    // Metodo public para mostrar detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: $" + saldo);
        // Nota: numeroCuenta es privado, pero la misma clase sí puede acceder a él internamente:
        System.out.println("Nro de Cuenta (interno): " + numeroCuenta);
    }
}
