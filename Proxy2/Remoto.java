package Proxy2;

public class Remoto {
    public static void main(String[] args) {
        Servicio servicio = new ProxyRemoto();
        servicio.solicitud();
    }
}
