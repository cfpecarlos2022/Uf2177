package polimorfismo;

public class Principal {

    public static void main(String[] args) {
        
        Transporte miTransporte = new Transporte();

        Transporte miCoche = new Coche();

        miTransporte.moverse();

        miCoche.moverse();
    }

}
