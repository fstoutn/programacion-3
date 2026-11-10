import java.util.ArrayList;
import java.util.List;

public class Curso {
    private final String nombre;
    private final String profesor;
    private final List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaDeEstudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public List<Estudiante> getListaDeEstudiantes() {
        return List.copyOf(listaDeEstudiantes);
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Curso: ").append(nombre).append(System.lineSeparator());
        resultado.append("Profesor: ").append(profesor).append(System.lineSeparator());
        resultado.append("Cantidad de alumnos: ")
                .append(listaDeEstudiantes.size())
                .append(System.lineSeparator());
        resultado.append("Alumnos:").append(System.lineSeparator());

        for (int i = 0; i < listaDeEstudiantes.size(); i++) {
            resultado.append("  ")
                    .append(i + 1)
                    .append(". ")
                    .append(listaDeEstudiantes.get(i))
                    .append(System.lineSeparator());
        }

        return resultado.toString();
    }
}
