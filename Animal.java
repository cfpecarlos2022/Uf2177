package gestionanimales;

//Paso 1. Creamos una clase llamada Animal.


public class Animal {
    
    String nombre = "Perro";
    int edad = 1;
    
    public void comprobarEdad(){
        
        if (edad>=2){
            System.out.println(nombre + " es adulto");
        }else{
            System.out.println(nombre + " es cachorro");
        }
    }

}
