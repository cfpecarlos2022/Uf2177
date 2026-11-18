package gestionanimales;


public class Main {
    
    public static void main(String[] args) {
        
        // Creamos el objeto
        Animal miAnimal = new Animal();
        
          // Mostramos sus características
        System.out.println("Animal: " + miAnimal.nombre);
        System.out.println("Edad: " + miAnimal.edad);
        
        
        //Llamar método
        miAnimal.comprobarEdad();
        
    }
    
}
