package reservashotel;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Paso 1. Crear el menú
        System.out.println("=================");
        System.out.println("     RESERVAS DE HOTEL");
        System.out.println("=================");

        System.out.println("1. Habitación Suite");
        System.out.println("2. Habitación Estándar");

        System.out.println("Seleccionar el tipo de habitación: ");
        int opcion = teclado.nextInt();

        //Paso 2. Seleccionar el tipo de habitación
        if (opcion == 1) {

            // Habitación Suite
            System.out.println("Introduce el número de habitación");
            int numero = teclado.nextInt();

            HabitacionSuite suite = new HabitacionSuite(numero, "Hotel NH", 150.0);

            System.out.println();

            suite.mostrarReserva();
        } else if (opcion == 2) {

            // Habitación Estándar
            System.out.println("Selecciona la planta:");
            int planta = teclado.nextInt();
            HabitacionEstandar estandar = new HabitacionEstandar(planta, "Hotel NH", 80.0);

            System.out.println();
            
            estandar.mostrarReserva();

        }else{
            System.out.println("Opción no válida");
        }

         teclado.close();
    }

}
