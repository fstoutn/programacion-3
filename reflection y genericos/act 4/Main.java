import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println("- " + elemento);
        }
    }

    public static void main(String[] args) {
        List<Integer> enteros = Arrays.asList(10, 20, 30, 40);
        List<String> cadenas = Arrays.asList("Java", "Reflection", "Genéricos");

        System.out.println("Lista de enteros:");
        imprimirLista(enteros);

        System.out.println("\nLista de cadenas:");
        imprimirLista(cadenas);
    }
}
