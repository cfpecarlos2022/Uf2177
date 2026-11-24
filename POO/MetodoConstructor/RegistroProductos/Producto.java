package producto;

public class Producto {

    //Atributos
    String nombre;
    int cantidad;

    //Constructor para dar valores al Producto1 y Producto2
    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    //Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Cantidad: " + cantidad);
    }

}
