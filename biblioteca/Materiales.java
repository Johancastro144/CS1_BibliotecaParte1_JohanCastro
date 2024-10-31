package biblioteca;

public class Materiales extends Material {

    public Materiales(String titulo, String tipo, String fechaRegistro, int cantidadRegistrada, int cantidadActual, int id) {
        super(titulo, tipo, fechaRegistro, cantidadRegistrada, cantidadActual, id);
    }

    @Override
    public void reservar() {
        System.out.println("Material " + titulo + " ha sido reservado.");
    }

    @Override
    public void renovar() {
        System.out.println("Material " + titulo + " ha sido renovado.");
    }

    @Override
    public void devolver() {
        System.out.println("Material " + titulo + " ha sido devuelto.");
    }
}
