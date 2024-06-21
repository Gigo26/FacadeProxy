package Proxy5;

public class ProxyRegistro implements Operacion {
    private OperacionReal operacionReal = new OperacionReal();

    @Override
    public void ejecutar() {
        System.out.println("ProxyRegistro: Antes de ejecutar operación.");
        operacionReal.ejecutar();
        System.out.println("ProxyRegistro: Después de ejecutar operación.");
    }
}
