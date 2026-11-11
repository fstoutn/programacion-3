public class Main {
    public static void main(String[] args) {
        Usuario usuarioUno = Usuario.builder()
                .id(1L)
                .nombre("Carla Gómez")
                .email("carla.gomez@example.com")
                .build();

        Usuario usuarioDos = Usuario.builder()
                .id(2L)
                .nombre("Diego Pérez")
                .email("diego.perez@example.com")
                .build();

        System.out.println("Usuarios creados con Builder:");
        System.out.println(usuarioUno);
        System.out.println(usuarioDos);
    }
}
