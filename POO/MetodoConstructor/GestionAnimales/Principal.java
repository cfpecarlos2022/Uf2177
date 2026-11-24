package perro;

public class Principal {

    public static void main(String[] args) {

        //Crear objetos utilizando el constructor
        Perro perro1 = new Perro("Toby", 5);
        Perro perro2 = new Perro("Luna", 2);
        
        //Mostrar información
        
        System.out.println("PRIMER PERRO");
        perro1.mostrarInformacion();
        
        System.out.println();
        
        System.out.println("SEGUNDO PERRO");
        perro2.mostrarInformacion();
    }

}
