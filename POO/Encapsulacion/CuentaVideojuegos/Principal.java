package encapsulacion;

public class Principal {

    public static void main(String[] args) {

        //Crear el objeto
        CuentaVideojuego jugador = new CuentaVideojuego(100);

        // Consultar puntos iniciales
        System.out.println("Puntos iniciales: " + jugador.getPuntos());

        // Modificar puntos
        jugador.setPuntos(250);
        
        // Consultar nuevos puntos
        System.out.println("Nuevos puntos: " + jugador.getPuntos());
    }

}
