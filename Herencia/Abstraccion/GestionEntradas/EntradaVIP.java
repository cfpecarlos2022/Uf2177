package gestionentradas;

//Paso 5. Escribir la herencia sobre la clase usando 'extends'
public class EntradaVIP extends Entrada {
    
    //Paso 6. Atributo propio de la clase EntradaVIP
    private int asiento;
    
    //Paso 7. Añadir constructor + Atributo propio que hemos creado

    public EntradaVIP(int asiento, String pelicula, double precio) {
        super(pelicula, precio);
        this.asiento = asiento;
    }
    
    //Paso 8. Implementar el método abstracto
    @Override
    public void mostrarEntrada(){ //Public por que va a ser la información que vea el cliente al solicitar esta entrada
        System.out.println("-- ENTRADA VIP --");
        System.out.println("Película: " + pelicula);
        System.out.println("Precio:: " + precio);
        System.out.println("Asiento: " + asiento);
    }
    
    
    
    
}
