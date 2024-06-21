package Proxy3;

public class ProxyImagen implements Imagen {
    private ImagenReal imagenReal;
    private String nombreArchivo;

    public ProxyImagen(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void mostrar() {
        if (imagenReal == null) {
            imagenReal = new ImagenReal(nombreArchivo);
        }
        imagenReal.mostrar();
    }
}
