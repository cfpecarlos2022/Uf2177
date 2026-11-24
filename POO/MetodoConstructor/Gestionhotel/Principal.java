package reserva;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        //Crear Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Solicitar datos
        System.out.println("Introduce el tipo de habitación: ");
        String tipo = teclado.nextLine();
        
        System.out.print("Introduce el número de noches: ");
        int noches = teclado.nextInt();
        
        //Crear el objeto utilizando el constructor
        Reserva miReserva = new Reserva(tipo,noches);
        
        //Llamar al método
        System.out.println();
        miReserva.mostrarInformacion();
        
         teclado.close();
        
        
    }
    
}
