package Facade1;

public class TiendaEnLinea {
    public static void main(String[] args) {
        PedidoFacade pedidoFacade = new PedidoFacade();
        String resultado = pedidoFacade.realizarPedido(1, 2, "Tarjeta de Crédito", "Calle Falsa 123");
        System.out.println(resultado);
    }
}
