package coche;

public class Principal {
    
    public static void main(String[] args) {
        //Crear Objeto
        Coche miCoche = new Coche();
        
        //Asignar valores
        miCoche.marca="Seat";
        miCoche.modelo="Ibiza";
        miCoche.arrancado=false;
        
        //Mostrar estado inicial
        miCoche.mostrarInformacion();
        
        System.out.println();
        
        //Arrancar el coche
          miCoche.arrancar();
          
        //Apagar el coche
          miCoche.apagar();
          
          //Mostrar estado final
          miCoche.mostrarInformacion();

        
    }
    
}
