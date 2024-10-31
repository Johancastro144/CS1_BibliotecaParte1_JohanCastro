package biblioteca;

public abstract class Material {
    protected String titulo;
    protected String tipo;
    protected String fechaRegistro;
    protected int cantidadRegistrada;
    protected int cantidadActual;
    protected int id;

    public Material(String titulo, String tipo, String fechaRegistro, int cantidadRegistrada, int cantidadActual, int id) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.fechaRegistro = fechaRegistro;
        this.cantidadRegistrada = cantidadRegistrada;
        this.cantidadActual = cantidadActual;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCantidadRegistrada() {
        return cantidadRegistrada;
    }

    public void setCantidadRegistrada(int cantidadRegistrada) {
        this.cantidadRegistrada = cantidadRegistrada;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Métodos abstractos
    public abstract void reservar();
    public abstract void renovar();
    public abstract void devolver();
}
