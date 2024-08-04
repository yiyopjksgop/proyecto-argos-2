import java.util.List;

public class Ropa extends Producto {
    private List<String> tallasRopa;
    private List<String> coloresRopa;

    // Constructor
    public Ropa(String codigo, String descripcion, List<String> tallasRopa, List<String> coloresRopa) {
        super(codigo, descripcion);
        this.tallasRopa = tallasRopa;
        this.coloresRopa = coloresRopa;

}

    // Método propio (aparte del toString heredado)
    public double aplicarDescuento(double porcentaje) {
        return super.calcularDescuento(porcentaje);
    }
    @Override
    public String toString() {
        return super.toString() + ", Tallas: " + tallasRopa + ", Colores: " + coloresRopa;
    }
}
