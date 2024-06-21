package Facade1;

public class Envios {
    public double calcularEnvio(String direccion) {
        System.out.println("Calculando costo de envío para " + direccion + "...");
        return 10.0; 
    }

    public boolean despacharPedido(String direccion) {
        System.out.println("Despachando pedido a " + direccion + "...");
        return true; 
    }
}