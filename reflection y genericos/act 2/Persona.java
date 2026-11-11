public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private String saludar() {
        return "Hola, soy " + nombre + ".";
    }

    public String mostrarInformacion() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
