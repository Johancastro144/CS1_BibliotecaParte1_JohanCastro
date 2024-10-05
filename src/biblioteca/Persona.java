package biblioteca;

public class Persona {
    private String nombre, apellido, rol;
    private int Id;
    
    public Persona(String nombre, String apellido, String rol, int Id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
}
