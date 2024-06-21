package Proxy2;

public class ProxyRemoto implements Servicio {
    private ServicioReal servicioReal;

    @Override
    public void solicitud() {
        if (servicioReal == null) {
            servicioReal = new ServicioReal();
        }
        System.out.println("ProxyRemoto: Redirigiendo solicitud a ServicioReal.");
        servicioReal.solicitud();
    }
}