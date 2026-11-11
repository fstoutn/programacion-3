import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Curso> cursos = new HashMap<>();

        cursos.put("PROG3", new Curso("Programación III", "Laura Gómez"));
        cursos.put("BD1", new Curso("Bases de Datos", "Martín Pérez"));
        cursos.put("WEB", new Curso("Desarrollo Web", "Sofía Rodríguez"));

        String codigoBuscado = "PROG3";
        Curso curso = cursos.get(codigoBuscado);
        System.out.println("Curso recuperado para " + codigoBuscado + ": " + curso);

        for (Map.Entry<String, Curso> entrada : cursos.entrySet()) {
            System.out.println("Código: " + entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
