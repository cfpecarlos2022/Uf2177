package persona;

//crear un programa que represente a una
//persona. Tendrá tres atributos y varios métodos para mostrar su información y realizar acciones.


public class Persona {
    
    String nombre;
    int edad;
    String ciudad;
    
    //Método para mostrar información
    public void mostrarInformacion(){
        
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Ciudad: "+ ciudad);        
    }
    
    //Método para saludar
    public void saludar(){
        System.out.println("Hola, me llamo " +nombre);
    }
    
    //Método para cumplir años
    public void cumplirAnios(){
        edad = edad+1;
        System.out.println("¡¡Feliz cumpleaños!!");
    }
    
    
}
