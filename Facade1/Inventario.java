package Facade1;

public class Inventario {
    public boolean verificarStock(int productoId, int cantidad){
        System.out.println("Verificando stock para el producto " + productoId + "...");
        return true;
    }
}
