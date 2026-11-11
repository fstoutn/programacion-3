import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Ana", 8.5, "A"),
                new Alumno("Bruno", 6.5, "A"),
                new Alumno("Carla", 9.5, "B"),
                new Alumno("Diego", 7.0, "B"),
                new Alumno("Elena", 10.0, "A"),
                new Alumno("Fabian", 5.5, "C")
        );

        // 1. Nombres aprobados, en mayúsculas y ordenados.
        List<String> aprobados = alumnos.stream()
                .filter(alumno -> alumno.getNota() >= 7)
                .map(alumno -> alumno.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Aprobados: " + aprobados);

        // 2. Promedio general de notas.
        double promedioGeneral = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0.0);
        System.out.printf("Promedio general: %.2f%n", promedioGeneral);

        // 3. Alumnos agrupados por curso.
        Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println("Alumnos por curso:");
        alumnosPorCurso.forEach((curso, estudiantes) ->
                System.out.println("  " + curso + ": " + estudiantes));

        // 4. Los tres mejores promedios.
        List<Alumno> mejoresPromedios = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Tres mejores promedios: " + mejoresPromedios);
    }
}
