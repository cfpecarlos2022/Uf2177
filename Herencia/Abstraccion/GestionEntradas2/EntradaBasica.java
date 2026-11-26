package gestionentradas;

//Paso 1. Crear el objeto Random para obtener un número aleatorio (Véase el ejemplo con Scanner)
import java.util.Random;

//Paso 2. Indicar la herencia
public class EntradaBasica extends Entrada {

    private int fila;
    private int asiento;

    //Paso 3. Crear Constructor con modifcaciones
    public EntradaBasica(int fila, String pelicula, double precio) {
        super(pelicula, precio);
        this.fila = fila;

        //Modificación ---> Características de esta entrada = Generamos un asiento aleatorio
        Random aleatorio = new Random();
        this.asiento = aleatorio.nextInt(20) + 1;
    }
    //Paso 4. Sobreescribir el método abstracto

    @Override
    public void mostrarEntrada() {
        System.out.println("--- ENTRADA BÁSICA ---");
        System.out.println("Película: " + pelicula);
        System.out.println("Precio:: " + precio);
        System.out.println("Fila: " + fila);
        System.out.println("Asiento: " + asiento);

    }

}
