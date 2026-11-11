import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Notebook", "Tecnología", 1200.00, 5),
                new Producto("Mouse", "Tecnología", 25.50, 20),
                new Producto("Escritorio", "Muebles", 350.00, 3),
                new Producto("Silla", "Muebles", 180.00, 8),
                new Producto("Cuaderno", "Librería", 12.75, 50),
                new Producto("Monitor", "Tecnología", 220.00, 10)
        );

        // 1. Productos con precio mayor a 100, ordenados de forma descendente.
        List<Producto> productosCaros = productos.stream()
                .filter(producto -> producto.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .collect(Collectors.toList());
        System.out.println("Productos con precio mayor a $100: " + productosCaros);

        // 2. Stock total por categoría.
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)));
        System.out.println("Stock total por categoría: " + stockPorCategoria);

        // 3. Nombre y precio de cada producto separados por punto y coma.
        String reporteProductos = productos.stream()
                .map(producto -> producto.getNombre() + " ($"
                        + String.format("%.2f", producto.getPrecio()) + ")")
                .collect(Collectors.joining("; "));
        System.out.println("Reporte de productos: " + reporteProductos);

        // 4. Precio promedio general y por categoría.
        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);
        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)));
        System.out.printf("Precio promedio general: $%.2f%n", promedioGeneral);
        System.out.println("Precio promedio por categoría:");
        promedioPorCategoria.forEach((categoria, promedio) ->
                System.out.printf("  %s: $%.2f%n", categoria, promedio));
    }
}
