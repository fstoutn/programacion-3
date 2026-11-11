import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<Persona> clasePersona = Persona.class;

        System.out.println("Constructores de Persona:");
        for (Constructor<?> constructor : clasePersona.getDeclaredConstructors()) {
            System.out.println("- " + constructor);
        }

        Constructor<Persona> constructor = clasePersona.getDeclaredConstructor(
                String.class, int.class);
        Persona persona = constructor.newInstance("Ana", 25);

        Field campoNombre = clasePersona.getDeclaredField("nombre");
        campoNombre.setAccessible(true);
        campoNombre.set(persona, "María");

        Method mostrarInformacion = clasePersona.getDeclaredMethod("mostrarInformacion");
        System.out.println("Información: " + mostrarInformacion.invoke(persona));

        Method saludar = clasePersona.getDeclaredMethod("saludar");
        // El método está declarado como private. Reflection permite acceder a él
        // temporalmente, sin eliminar la declaración de encapsulamiento de la clase.
        saludar.setAccessible(true);
        System.out.println("Invocación de Saludar(): " + saludar.invoke(persona));
        saludar.setAccessible(false);
        System.out.println("Saludar() conserva su encapsulamiento private.");
    }

}
