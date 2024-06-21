package Facade1;

public class Pagos {
    public boolean procesarPago(String metodoPago, double monto) {
        System.out.println("Procesando pago de " + monto + " usando " + metodoPago + "...");
        return true; 
    }
}
