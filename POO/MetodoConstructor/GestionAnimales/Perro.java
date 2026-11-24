package perro;

public class Perro {
    
    //Atributos
    String nombre;
    int edad;
    
    //Constructor
    public Perro(String nombre, int edad){
        
        this.nombre = nombre;
        this.edad=edad;
    }
    
    //Método para mostrar información
    
    public void mostrarInformacion(){
        
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);        
    }
    
}
