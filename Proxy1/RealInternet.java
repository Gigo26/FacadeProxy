package Proxy1;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Conectando a " + serverHost);
    }
}
