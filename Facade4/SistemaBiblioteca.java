package Facade4;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        
        biblioteca.mostrarLibrosDisponibles();
        
        biblioteca.realizarPrestamo("El Quijote");
        
        biblioteca.devolverLibro("El Quijote");
    }
}
