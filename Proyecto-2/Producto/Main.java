import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        // lista de transporte
        List<String> tipo = new ArrayList<>();
        tipo.add("terrestre");
        tipo.add("aereo");
        tipo.add("maritimo");

        Transporte transporte = new Transporte("T004", "Transporte aéreo", tipo, 3.0);
        // lista de tallasRopa y coloresRopa
        List<String> tallasRopa = new ArrayList<>();
        tallasRopa.add("S");
        tallasRopa.add("M");
        tallasRopa.add("L");

        List<String> coloresRopa = new ArrayList<>();
        coloresRopa.add("Rojo");
        coloresRopa.add("Azul");
        coloresRopa.add("Verde");


        Ropa ropa = new Ropa("12345", "Camisa", tallasRopa, coloresRopa);

        Producto pedido2 = new Producto ("09V4T6", "sueter");
        pedido2.calcularDescuento(2);

        // Imprimir información de cada objeto
        System.out.println("\nTransporte:");
        System.out.println(transporte.toString());
        transporte.calcularCostoEnvio(1000.0);      // calcular costo de envío para 1000 km
        
        System.out.println("Ropa:");
        System.out.println(ropa.toString());
        System.out.println("Precio con descuento del 20%: " + ropa.aplicarDescuento(20.0));

        // Calcular el total del pedido
        Pedido pedido = new Pedido() ;
        pedido.calcularTotal();
        //pedido = null;
        double total = pedido.calcularTotal();
        System.out.println("El total del pedido es: " + total);

        // Calcular la fecha de entrega estimada
        pedido.calcularFechaEntregaEstimada();
        System.out.println("Fecha de entrega estimada: " + pedido.getFechaEntregaEstimada()); // Suponiendo que tienes un getter para obtener la fecha
        }
    }