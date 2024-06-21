package Proxy3;

public class Virtual {
    public static void main(String[] args) {
        Imagen imagen = new ProxyImagen("test.jpg");
        imagen.mostrar();
        System.out.println("");
        imagen.mostrar();
    }
}
