import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        agregarSiNoExiste(productos,
                new Producto("P001", "Teclado mecánico", 45000.00));
        agregarSiNoExiste(productos,
                new Producto("P002", "Mouse inalámbrico", 28000.00));
        agregarSiNoExiste(productos,
                new Producto("P003", "Monitor 24 pulgadas", 185000.00));

        // Tiene el mismo código que P001, por lo tanto contains() lo reconoce
        // como duplicado aunque cambien su nombre y su precio.
        Producto productoDuplicado = new Producto(
                "P001", "Teclado mecánico - oferta", 39000.00
        );
        agregarSiNoExiste(productos, productoDuplicado);

        System.out.println("Productos registrados:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    private static void agregarSiNoExiste(List<Producto> productos, Producto producto) {
        if (productos.contains(producto)) {
            System.out.println("No se agregó el producto con código "
                    + producto.getCodigo() + ": ya existe.");
            return;
        }

        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getCodigo());
    }
}
