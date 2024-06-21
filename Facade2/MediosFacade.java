package Facade2;

public class MediosFacade {

    private CargadorArchivos cargadorArchivo;
    private Decodificador decodificador;
    private Reproductor reproductor;
    private SalidaAudio salidaAudio;

    public MediosFacade() {
        this.cargadorArchivo = new CargadorArchivos();
        this.decodificador = new Decodificador();
        this.reproductor = new Reproductor();
        this.salidaAudio = new SalidaAudio();
    }

    public void reproducirMedia(String nombreArchivo) {
        cargadorArchivo.cargarArchivo(nombreArchivo);
        decodificador.decodificar(nombreArchivo);
        reproductor.reproducir();
    }

    public void pausarMedios() {
        reproductor.pausar();
    }

    public void detenerMedios() {
        reproductor.detener();
    }

    public void setVolumen(int volumen) {
        salidaAudio.setVolumen(volumen);
    }
}
