import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto productoUno = new Producto(
                "P001", "Libro de Java", 18500.00, "Juan Autor");
        Producto productoDos = new Producto(
                "P002", "Libro de Bases de Datos", 22000.00, "Laura Autora");
        Producto productoTres = new Producto(
                "P003", "Libro de Programación Web", 19800.00, "Pedro Autor");

        List<ProductoDTO> productosDTO = new ArrayList<>();
        productosDTO.add(convertirADTO(productoUno));
        productosDTO.add(convertirADTO(productoDos));
        productosDTO.add(convertirADTO(productoTres));

        System.out.println("Productos transportados mediante DTO:");
        productosDTO.forEach(System.out::println);
    }

    private static ProductoDTO convertirADTO(Producto producto) {
        ProductoDTO dto = new ProductoDTO();
        dto.setCodigo(producto.getCodigo());
        dto.setNombre(producto.getNombre());
        dto.setPrecio(producto.getPrecio());
        return dto;
    }
}
