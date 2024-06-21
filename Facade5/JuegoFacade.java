package Facade5;

public class JuegoFacade {
    private GestorGraficos gestorGraficos;
    private GestorSonido gestorSonido;
    private GestorEntrada gestorEntrada;
    private GestorFisica gestorFisica;

    public JuegoFacade() {
        this.gestorGraficos = new GestorGraficos();
        this.gestorSonido = new GestorSonido();
        this.gestorEntrada = new GestorEntrada();
        this.gestorFisica = new GestorFisica();
    }

    public void cargarRecursos(String recursoGrafico, String archivoSonido) {
        gestorGraficos.cargarGraficos(recursoGrafico);
        gestorSonido.cargarSonido(archivoSonido);
    }

    public void iniciarJuego() {
        gestorGraficos.renderizarGraficos();
        gestorSonido.reproducirSonido("musica_fondo.mp3");
    }

    public void procesarBucleJuego() {
        gestorEntrada.procesarEntrada();
        gestorFisica.actualizarFisica();
        gestorGraficos.renderizarGraficos();
    }
}
