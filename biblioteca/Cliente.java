package biblioteca;


public class Cliente extends Usuario {
    public Cliente(String nombre, int id, String correo) {
        super(nombre, id, correo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cliente - Nombre: " + getNombre() + ", ID: " + getId() + ", Correo: " + getCorreo());
    }
}