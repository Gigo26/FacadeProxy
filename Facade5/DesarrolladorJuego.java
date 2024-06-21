package Facade5;

public class DesarrolladorJuego {
    public static void main(String[] args) {
        JuegoFacade juegoFacade = new JuegoFacade();
        juegoFacade.cargarRecursos("graficos_juego.png", "sonido_juego.mp3");
        juegoFacade.iniciarJuego();

        for (int i = 0; i < 3; i++) {
            juegoFacade.procesarBucleJuego();
        }
    }
}
