public class Main {
    public static void main(String[] args) {
        Curso estructurasDeDatos = new Curso(
                "Estructuras de Datos",
                "Prof. Carlos Ruiz"
        );
        estructurasDeDatos.agregarEstudiante(
                new Estudiante("Juan", 20, "Ingeniería en Sistemas")
        );
        estructurasDeDatos.agregarEstudiante(
                new Estudiante("María", 22, "Diseño Gráfico")
        );
        estructurasDeDatos.agregarEstudiante(
                new Estudiante("Pedro", 21, "Medicina")
        );

        Curso programacionTres = new Curso(
                "Programación III",
                "Prof. Laura Gómez"
        );
        programacionTres.agregarEstudiante(
                new Estudiante("Ana", 23, "Tecnicatura Universitaria en Programación")
        );
        programacionTres.agregarEstudiante(
                new Estudiante("Lucas", 21, "Tecnicatura Universitaria en Programación")
        );

        System.out.println(estructurasDeDatos);
        System.out.println(programacionTres);
    }
}
