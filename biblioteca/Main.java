package biblioteca;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de PersonaControl
        PersonaControl personaControl = new PersonaControl();
        
        // Crear personas
        personaControl.crearPersona("Juan", "Perez", "Estudiante", 1);
        personaControl.crearPersona("Ana", "Lopez", "Docente", 2);
        personaControl.crearPersona("Carlos", "Gonzalez", "Administrador", 3);
        
        // Mostrar personas
        personaControl.mostarPersona();
        
        // Actualizar una persona
        personaControl.actualizarPersona(1, "Juan Carlos", "Perez", "Estudiante Avanzado");
        
        // Mostrar personas después de la actualización
        System.out.println("\nDespues de actualizar:");
        personaControl.mostarPersona();
        
        // Eliminar una persona
        personaControl.eliminarPersona(2);
        
        // Mostrar personas después de la eliminación
        System.out.println("\nDespues de eliminar a Ana Lopez:");
        personaControl.mostarPersona();
        
        MaterialControl materialControl = new MaterialControl("Título Ejemplo", "Tipo Ejemplo", "01-01-2024", 10, 10, 1);
        
        // Crear materiales
        materialControl.crearMaterial("Libro de Java", "Libro", "15-09-2024", 5, 5, 1);
        materialControl.crearMaterial("Video de Historia", "Video", "20-09-2024", 3, 3, 2);
        
        // Mostrar materiales (no se requiere un método específico, pero se puede crear uno)
        System.out.println("\nLista de materiales:");
        materialControl.mostrarMateriales(1); // Muestra un mensaje para demostrar que se está usando

        // Actualizar un material
        System.out.println("\nActualizando material con ID 1:");
        materialControl.actualizarMaterial(1);
        
        // Mostrar materiales después de la actualización
        System.out.println("\nDespués de actualizar el material:");
        materialControl.mostrarMateriales(1); // Muestra un mensaje para demostrar que se está usando

        // Eliminar un material
        System.out.println("\nEliminando material con ID 2:");
        materialControl.eliminarMaterial(2);

        // Mostrar materiales después de la eliminación
        System.out.println("\nDespués de eliminar un material:");
        materialControl.mostrarMateriales(1); // Muestra un mensaje para demostrar que se está usando
        
        // Reservar material
        System.out.println("\nReservando material con ID 1:");
        materialControl.reservarMateriales(1);
        
        // Devolver material
        System.out.println("\nDevolviendo material con ID 1:");
        materialControl.devolverMaterial(1);
    }
    
}
