package Proxy4;

public class Cache {
    public static void main(String[] args) {
        ServicioCostoso servicio = new ProxyCache();
        
        System.out.println("Resultado: " + servicio.realizarOperacion(5)); 
        
        System.out.println("Resultado: " + servicio.realizarOperacion(5)); 
    }
}
