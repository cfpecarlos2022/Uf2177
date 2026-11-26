package reservashotel;

//Paso 5. hacemos que herede de la clase abstracta (extends)
import java.util.Random;

public class HabitacionEstandar extends Habitacion {

    private int planta;
    private int numeroHabitacion;

    // Constructor
    public HabitacionEstandar(int planta, String hotel, double precio) {

        super(hotel, precio);

        this.planta = planta;

        // Generamos un número aleatorio
        Random aleatorio = new Random();

        this.numeroHabitacion = aleatorio.nextInt(20) + 1;
    }

    // Sobreescribimos el método
    @Override
    public void mostrarReserva() {

        System.out.println("--- RESERVA ESTÁNDAR ---");
        System.out.println("Hotel: " + hotel);
        System.out.println("Planta: " + planta);
        System.out.println("Habitación: " + numeroHabitacion);
        System.out.println("Precio por noche: " + precio + " €");

    }
}
