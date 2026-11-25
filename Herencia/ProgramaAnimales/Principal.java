package herencia;


public class Principal {
    public static void main(String[] args) {
        
        //Crear un objeto perro y gato
        Perro miPerro = new Perro();
        Gato miGato = new Gato();
        
        // Asignar atributos heredados
        miPerro.nombre="Toby";
        miPerro.edad=5;
        
        //Asignar atributo propio de perro
        miPerro.raza="Labrador";
        
        //Mostrar información del perro
        System.out.println("INFORMACIÓN DEL PERRO");
        System.out.println("----------------------");
        
        miPerro.ladrar();
        
        miPerro.mostrarInformacion();
        
        System.out.println("Raza: " + miPerro.raza);
        
        // Asignar atributos heredados de gato
        miGato.nombre="Garfield";
        miGato.edad=3;
        
         // Asignar atributo propio
        miGato.color= "Naranja";
        
        //Mostrar informaciópn del gato
         System.out.println("INFORMACIÓN DEL GATO");
         System.out.println("--------------------");
         
         miGato.mostrarInformacion();
         
         System.out.println("Color: " + miGato.color);
         miGato.maullar();
        
        
        
    }
    
}
