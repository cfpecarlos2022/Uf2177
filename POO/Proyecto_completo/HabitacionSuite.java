package reservashotel;

public class HabitacionSuite extends Habitacion {

    private int numeroHabitacion;

    //Constructor
    public HabitacionSuite(int numeroHabitacion, String hotel, double precio) {
        super(hotel, precio);
        this.numeroHabitacion = numeroHabitacion;
    }

    //Sobreecribimos el método
    @Override
    public void mostrarReserva() {
        System.out.println("--- RESERVA SUITE ---");
        System.out.println("Hotel: " + hotel);
        System.out.println("Habitación: " + numeroHabitacion);
        System.out.println("Precio por noche: " + precio + " €");

    }

}
