public class Producto {
    private String codigo;
    private String descripcion;

    // Constructor
    public Producto(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    // Método propio
    public double calcularDescuento(double porcentaje) {
        double precio = 20;
        double descuento = precio * porcentaje / 100;
        return precio - descuento;
    }
    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion;
    }
}