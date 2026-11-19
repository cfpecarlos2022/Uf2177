package redsocial;

// Método: es un conjunto de instrucciones que se agrupan bajo un nombre para realizar una tarea concreta

//Parámetros: Un parámetro es una variable que se declara dentro de los paréntesis de un método.

//Argumento: Un argumento es el valor concreto que enviamos al método cuando lo llamamos


public class RedSocial {
    
    public static void main(String[] args) { //Método main: punto de inicio de la ejecución del programa
        
         // Llamamos al método y enviamos "Carlos" como argumento
        mostrarBienvenida("Carlos");
        
         // Volvemos a llamar al método enviando "María" como argumento
        mostrarBienvenida("María");
        
         // Llamamos nuevamente al método enviando "Pedro" como argumento
        mostrarBienvenida("Pedro");
        
    }
    
    // Declaramos un método llamado mostrarBienvenida
    // public: permite acceder al método desde otras clases
    // static: permite llamarlo sin crear un objeto
    // void: indica que no devuelve ningún valor
     // String nombre: parámetro que recibirá el nombre del usuario
    public static void mostrarBienvenida(String nombre){
        System.out.println("Bienvenido a nuestra red social, " + nombre);
    }
    
}
