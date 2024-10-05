package biblioteca;


public class Materiales {

    private String titulo;
    private String tipo;
    private String fechaRegistro;
    private int cantidaRegistrada, cantidadActual;
    private int Id;
    
    public Materiales (String titulo, String tipo, String fechaRegistro, int cantidadRegistrada, int cantidadActual, int Id) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.fechaRegistro = fechaRegistro;
        this.cantidaRegistrada = cantidadRegistrada;
        this.cantidadActual = cantidadActual;
        this.Id = Id;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCantidaRegistrada() {
        return cantidaRegistrada;
    }

    public void setCantidaRegistrada(int cantidaRegistrada) {
        this.cantidaRegistrada = cantidaRegistrada;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nombre) {
        this.titulo = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void reservar() {
        System.out.println("Material " + titulo + " ha sido reservado.");
    }

    public void renovar() {
        System.out.println("Material " + titulo + " ha sido renovado.");
    }

    public void devolver() {
        System.out.println("Material " + titulo + " ha sido devuelto.");
    }
    }

