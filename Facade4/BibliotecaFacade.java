package Facade4;

public class BibliotecaFacade {
    private Libro libro;
    private Inventario inventario;
    private Prestamo prestamo;
    private Devoluciones devoluciones;

    public BibliotecaFacade() {
        this.libro = new Libro();
        this.inventario = new Inventario();
        this.prestamo = new Prestamo();
        this.devoluciones = new Devoluciones();
    }

    public void realizarPrestamo(String titulo) {
        libro.seleccionarLibro(titulo);
        prestamo.realizarPrestamo(titulo);
    }

    public void devolverLibro(String titulo) {
        libro.seleccionarLibro(titulo);
        devoluciones.devolverLibro(titulo);
    }

    public void mostrarLibrosDisponibles() {
        inventario.mostrarLibros();
    }
}
