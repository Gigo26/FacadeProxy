package Facade3;

public class AutomatizacionHogarFacade {
    private Puertas puertas;
    private Cerrojo cerrojo;
    private CamaraSeguridad camaraSeguridad;
    private Luces luces;

    public AutomatizacionHogarFacade() {
        this.puertas = new Puertas();
        this.cerrojo = new Cerrojo();
        this.camaraSeguridad = new CamaraSeguridad();
        this.luces = new Luces();
    }

    public void activarModoNocturno() {
        puertas.cerrarPuertas();
        cerrojo.activarCerrojo();
        camaraSeguridad.activarGrabacion();
        luces.apagarLuces();
    }
}
