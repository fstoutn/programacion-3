import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto productoUno = new Producto(
                "P001", "Teclado mecánico", "TecnoDistribución", 45000.00);
        Producto productoDos = new Producto(
                "P002", "Mouse inalámbrico", "Periféricos del Sur", 28000.00);
        Producto productoTres = new Producto(
                "P003", "Monitor 24 pulgadas", "Pantallas Argentinas", 185000.00);

        List<ProductoRecord> productos = new ArrayList<>();
        productos.add(convertirARecord(productoUno));
        productos.add(convertirARecord(productoDos));
        productos.add(convertirARecord(productoTres));

        System.out.println("Productos representados con records:");
        productos.forEach(System.out::println);
    }

    private static ProductoRecord convertirARecord(Producto producto) {
        return new ProductoRecord(
                producto.getCodigo(),
                producto.getNombre(),
                producto.getPrecio());
    }
}
