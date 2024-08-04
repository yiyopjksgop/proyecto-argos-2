public interface InterfacePedido {
    void agregarProducto();

    void eliminarProducto();

    double calcularTotal();

    void calcularFechaEntregaEstimada();

    String getFechaEntregaEstimada();
}