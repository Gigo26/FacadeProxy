package Proxy5;

public class OperacionReal implements Operacion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando operación.");
    }
}
