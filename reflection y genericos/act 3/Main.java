import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Programación III");

        Caja<Integer> cajaDeNumero = new Caja<>();
        cajaDeNumero.guardar(2026);

        System.out.println("Caja de String: " + cajaDeTexto);
        System.out.println("Valor obtenido: " + cajaDeTexto.obtener());
        System.out.println("Caja de Integer: " + cajaDeNumero);
        System.out.println("Valor obtenido: " + cajaDeNumero.obtener());

        // Colección sin genéricos: pierde seguridad de tipos y requiere cast.
        List listaSinGenericos = new ArrayList();
        listaSinGenericos.add("Texto");
        listaSinGenericos.add(10);
        String texto = (String) listaSinGenericos.get(0);
        System.out.println("Colección sin genéricos: " + listaSinGenericos);
        System.out.println("Valor recuperado mediante cast: " + texto);

        // Con una colección genérica, el compilador conoce el tipo de cada elemento.
        List<String> listaGenerica = new ArrayList<>();
        listaGenerica.add("Texto seguro");
        System.out.println("Colección genérica: " + listaGenerica);
    }
}
