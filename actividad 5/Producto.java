import java.util.Objects;

/**
 * Representa un producto identificado de manera única por su código.
 */
public class Producto {
    private final String codigo;
    private final String nombre;
    private final double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = Objects.requireNonNull(codigo, "El código no puede ser nulo");
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser nulo");
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof Producto)) {
            return false;
        }

        Producto otroProducto = (Producto) objeto;
        return codigo.equals(otroProducto.codigo);
    }

    /**
     * Debe utilizar el mismo atributo que equals(): el código.
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
