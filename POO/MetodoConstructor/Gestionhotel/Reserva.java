package reserva;


public class Reserva {
    
    //Atributos
    String tipoHabitacion;
    int numeroNoches;

    //Constructor
    public Reserva(String tipoHabitacion, int numeroNoches) {
        this.tipoHabitacion = tipoHabitacion;
        this.numeroNoches = numeroNoches;
    }
    
    //Método
    public void mostrarInformacion(){
        System.out.println("--- DATOS DE LA RESERVA ---");
        System.out.println("Tipo de habitación: " + tipoHabitacion);
        System.out.println("Número de noches: " + numeroNoches);
    }
    
}
