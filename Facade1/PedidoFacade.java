package Facade1;

public class PedidoFacade {
    private Inventario inventario;
    private Pagos pagos;
    private Envios envio;
    private Notificaciones notificaciones;

    public PedidoFacade() {
        this.inventario = new Inventario();
        this.pagos = new Pagos();
        this.envio = new Envios();
        this.notificaciones = new Notificaciones();
    }
    
    public String realizarPedido(int productoId, int cantidad, String metodoPago, String direccion) {
        if (!inventario.verificarStock(productoId, cantidad)) {
            return "Stock insuficiente";
        }

        double costoEnvio = envio.calcularEnvio(direccion);
        if (!pagos.procesarPago(metodoPago, costoEnvio)) {
            return "Pago fallido";
        }

        if (!envio.despacharPedido(direccion)) {
            return "Error en el despacho";
        }

        notificaciones.enviarConfirmacion("Su pedido ha sido procesado y está en camino.");
        return "Pedido procesado con éxito";
    }
}
