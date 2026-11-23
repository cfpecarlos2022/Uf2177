// crear un programa que represente un coche. El coche tendrá una propiedad que indicará si está arrancado o apagado.
package coche;

public class Coche {

    //Atributos
    String marca;
    String modelo;
    boolean arrancado;

    //Método para arrancar el coche
    public void arrancar() {
        arrancado = true;
        System.out.println("El coche está arrancado");
    }

    //Método para arrancar el coche
    public void apagar() {
        arrancado = false;
        System.out.println("El coche se ha apagado");
    }

    //Método para mostrar información
    public void mostrarInformacion() {
        
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        
        if (arrancado== true){
            System.out.println("Estado: Arrancado");
        }else{
            System.out.println("Estado: Apagado");
        }
        
    }

}
