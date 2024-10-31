
package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MaterialControl extends Materiales{
    
    private List<Materiales> materiales = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    
    public MaterialControl(String titulo, String tipo, String fechaRegistro, int cantidadRegistrada, int cantidadActual, int Id) {
        super(titulo, tipo, fechaRegistro, cantidadRegistrada, cantidadActual, Id);
    }
    public void crearMaterial(String titulo, String tipo, String fechaRegistro, int cantidadRegistrada, int cantidadActual, int Id) {
        Materiales nuevoMaterial = new Materiales(titulo, tipo, fechaRegistro, cantidadRegistrada, cantidadActual, Id);
        materiales.add(nuevoMaterial);
        System.out.println("Material agregado");
    }

    public void eliminarMaterial(int id) {
        for (int i = 0; i < materiales.size(); i++) {
            if (materiales.get(i).getId()== id ) {
                materiales.remove(i);
                System.out.println("Material eliminado");
                return;
            }
        }
        System.out.println("Material no encontrado");
    }

    public void actualizarMaterial(int id) {
        try {
        for (int i = 0; i < materiales.size(); i++) {
            if (materiales.get(i).getId()== id) {
                System.out.println("Ingrese el nuevo titulo: ");
                String titulo = sc.nextLine();
                System.out.println("Ingrese el nuevo tipo: ");
                String tipo = sc.nextLine();
                System.out.println("Ingrese la nueva fecha de registro: ");
                String fechaRegistro = sc.next();
                System.out.println("Ingrese la nueva cantidad registrada: ");
                int cantidadRegistrada = sc.nextInt();
                System.out.println("Ingrese la nueva cantidad actual: ");
                int cantidadActual = sc.nextInt();
                materiales.get(i).setTitulo(titulo);
                materiales.get(i).setTipo(tipo);
                materiales.get(i).setFechaRegistro(fechaRegistro);
                materiales.get(i).setCantidadRegistrada(cantidadRegistrada);
                materiales.get(i).setCantidadActual(cantidadActual);
                System.out.println("Material actualizado");
                return;
            }
        }
        System.out.println("Material no encontrado");
        }catch(Exception e) {
            System.out.println("Error al guardar el material: " + e.getMessage());
        }
    }
    public void reservarMateriales(int id){
        for (int i = 0; i < materiales.size(); i++) {
            if (materiales.get(i).getId()== id ) {
                System.out.println("Material " + materiales + " ha sido renovado.");
                return;
            }
        }
        System.out.println("El material no está reservado.");
    }
    public void devolverMaterial(int id) {
        for (int i = 0; i < materiales.size(); i++) {
            if (materiales.get(i).getId()== id) {
                System.out.println("Material " + id + " ha sido devuelto.");
                return;
            }
        }
        System.out.println("El material no está reservado.");
    }
    public void mostrarMateriales(int id) {
        for (int i = 0; i < materiales.size(); i++) {
        System.out.println("Material " + id + " ha sido mostrado.");        
        }
    }
}

        
            
                   
    

