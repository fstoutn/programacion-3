import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Ana", 8.5));
        alumnos.add(new Alumno("Bruno", 7.0));
        alumnos.add(new Alumno("Carla", 9.5));
        alumnos.add(new Alumno("Ana", 8.5)); // Los duplicados están permitidos.

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
