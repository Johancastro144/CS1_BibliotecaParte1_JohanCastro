
package biblioteca;
import java.util.ArrayList;
import java.util.List;
 
    public class Main {
    private static List<Persona> persona = new ArrayList<>();
    private static List<Materiales> materiales = new ArrayList<>();

    public static void main(String[] args) {
        crearUsuario("Juan Pérez", 1, "juan@example.com");
        crearUsuario("Ana López", 2, "ana@example.com");

        
        crearMaterial("Libro de Java", "Libro");
        crearMaterial("Documental de Historia", "Video");

        
        mostrarUsuarios();
        mostrarMateriales();

        
        Materiales material = materiales.get(0);
        MaterialControl.reservarMateriales(material);
        MaterialControl.actualizarMaterial(material);
        MaterialControl.devolverMaterial(material);

        actualizarUsuario(1, "Juan Pérez", "juan_actualizado@example.com");

        eliminarUsuario(2);

        mostrarUsuarios();
        mostrarMateriales();
    }

    public static void crearUsuario(String nombre, int id, String correo) {
        Persona usuario = new Persona (nombre, id, correo);
        persona.add(usuario);
        System.out.println("Usuario creado: " + usuario);
    }

    public static void eliminarUsuario(int id) {
       persona.removeIf(u -> u.getId() == id);
        System.out.println("Usuario con ID " + id + " eliminado.");
    }

    public static void actualizarUsuario(int id, String nombre, String correo) {
        for (Persona u : persona) {
            if (u.getId() == id) {
                u.setNombre(nombre);
                u.setCorreo(correo);
                System.out.println("Usuario con ID " + id + " actualizado.");
            }
        }
    }

    public static void mostrarUsuarios() {
        System.out.println("\nLista de Usuarios:");
        for (Persona u : persona) {
            System.out.println(u);
        }
    }

    // Métodos para manejo de materiales
    public static void crearMaterial(String titulo, String tipo) {
        Materiales material = new Materiales (titulo, tipo);
        materiales.add(material);
        System.out.println("Material creado: " + material);
    }

    public static void mostrarMateriales() {
        System.out.println("\nLista de Materiales:");
        for (Materiales m : materiales) {
            System.out.println(m);
        }
    }
}
