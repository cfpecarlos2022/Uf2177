package reservashotel;


 public abstract class Habitacion {

    // Atributos comunes
    protected String hotel;
    protected double precio;

    // Constructor
    public Habitacion(String hotel, double precio) {
        this.hotel = hotel;
        this.precio = precio;
    }

    // Método abstracto
    public abstract void mostrarReserva();
}
