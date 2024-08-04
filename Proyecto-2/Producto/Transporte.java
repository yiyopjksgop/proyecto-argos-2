import java.util.List;

public class Transporte extends Producto implements InterfacePedido {
    private List<String> tipo;                // Tipo de transporte (terrestre, aéreo, marítimo)
    private double tiempoEntrega;      // Tiempo estimado de entrega

    // Constructor
    public Transporte(String codigo, String descripcion, List<String> tipo, double tiempoEntrega) {
        super(codigo, descripcion);
        this.tipo = tipo;
        this.tiempoEntrega = tiempoEntrega;
    }

    // getters y setters

    public double getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(double tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    // Método propio
    public void calcularCostoEnvio(double distancia) {
        // Implementar la lógica para calcular el costo de envío según el tipo de transporte y la distancia
    }
    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo + ", Tiempo de entrega: " + tiempoEntrega;
    }
    public void agregarProducto() {
        System.out.println("Agregar el pedido");
    }

    public void eliminarProducto() {
        System.out.println("Eliminar el pedido");
    }

    public double calcularTotal() {
        System.out.println("Calcular el total");
        return 0;
    }

    public void calcularFechaEntregaEstimada() {
        System.out.println("Calcular la fecha de entrega estimada");
    }

    public String getFechaEntregaEstimada() {
        System.out.println("Fecha de entrega estimada");
        return "";
    }
}