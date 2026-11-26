package gestionentradas;

//Paso 1. Modificar la clase a bastracta
public abstract class Entrada {

    // Paso 2.  Atributos protected para poder acceder desde el mismo package o desde las clases hijas
    protected String pelicula;
    protected double precio;
    
    //Paso 3. Constructor 
    public Entrada(String pelicula, double precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }
    
    //Paso 4. Método abstracto
    public abstract void mostrarEntrada();

}
