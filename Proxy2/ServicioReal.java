package Proxy2;

public class ServicioReal implements Servicio {
    @Override
    public void solicitud() {
        System.out.println("ServicioReal: Manejo de solicitud.");
    }
}