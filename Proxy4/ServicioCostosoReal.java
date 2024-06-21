package Proxy4;

public class ServicioCostosoReal implements ServicioCostoso {
    @Override
    public int realizarOperacion(int entrada) {
        // Simulación de operación costosa
        try {
            Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return entrada * entrada;
    }
}
