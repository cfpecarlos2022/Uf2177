package videojuego;


public class Principal {
    
    public static void main(String[] args) {
         // Método principal: punto de inicio del programa
         
         // Crear un objeto de la clase videojuego
         
         Videojuego juego1 = new Videojuego();
         Videojuego juego2 = new Videojuego();
         
           // Llamamos al método juego1 y enviamos dos argumentos
         juego1.mostrarInformacion("FIFA", 100);
         
           // Llamamos al método juego1 y enviamos dos argumentos
         juego1.mostrarInformacion("Doom", 60);
         
         // Llamamos al método juego2 y enviamos dos argumentos
         juego2.mostrarInformacion("Mario Bros", 150);
    }
    
}
