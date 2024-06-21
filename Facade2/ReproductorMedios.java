package Facade2;

public class ReproductorMedios {

    public static void main(String[] args) {
        MediosFacade mediosFacade = new MediosFacade();
        mediosFacade.reproducirMedia("cancion.mp3");
        mediosFacade.setVolumen(75);
        mediosFacade.pausarMedios();
        mediosFacade.detenerMedios();
    }
    
}
