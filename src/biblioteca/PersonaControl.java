package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class PersonaControl {
    private List <Persona> personas;

    public PersonaControl() {
        personas = new ArrayList<>();
    }
        
    public void crearPersona(String nombre, String apellido, String rol, int Id) {
        Persona nuevaPersona = new Persona( nombre, apellido, rol, Id);
        personas.add(nuevaPersona);
        System.out.println("Agrego personas");  
    } 
    
    public void eliminarPersona(int Id){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getId() == Id) {
                personas.remove(i);
                System.out.println("Persona eliminada");
                return;
            }
        }
        System.out.println("persona no encontrada");
    }
    
    public void actualizarPersona(int id, String nombre, String apellido, String rol){
        for (int i = 0; i < personas.size(); i++){
            if (personas.get(i).getId() == id){
                personas.get(i).setNombre(nombre);
                personas.get(i).setApellido(apellido);
                personas.get(i).setRol(rol);
                System.out.println("datos actulizados");
                return;
            }
        }
            System.out.println("persona no encontrada");
    }
    
    public void mostarPersona(){
        System.out.println("Lista de personas");
        for (Persona persona : personas){
            
            System.out.println("Nombre: " + persona.getNombre() +  ", Apellido: " + persona.getApellido() + ", Rol: " + persona.getRol() + ", ID: " + persona.getId());       
        }
    }
}
