package videojuego;

// Esta clase contendrá el método encargado de mostrar la información del videojuego.
public class Videojuego {
    
    //Paso1. Declaramos un método para mostrar la información del videojuego
    // String titulo: parámetro que recibirá el nombre del videojuego
    // int horas: parámetro que recibirá las horas de duración
    
    public void mostrarInformacion(String titulo, int horas){
        
        //Mostramos el título y las horas de duración
        System.out.println("Videojuego: " + titulo);
        System.out.println("Duración: " + horas + " horas.");
    }
    
}
