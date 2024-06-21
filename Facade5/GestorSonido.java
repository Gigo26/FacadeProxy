package Facade5;

public class GestorSonido {
    public void cargarSonido(String archivoSonido) {
        System.out.println("Cargando archivo de sonido: " + archivoSonido);
    }

    public void reproducirSonido(String archivoSonido) {
        System.out.println("Reproduciendo sonido: " + archivoSonido);
    }
}