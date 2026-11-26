package gestionentradas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Paso 1. Creación del menú
        System.out.println("========================");
        System.out.println("     GESTIÓN DE ENTRADAS DE CINE");
        System.out.println("========================");
        
        System.out.println("1. Entrada VIP");
        System.out.println("2. Entrada Básica");

        System.out.println("Selecciona el tipo de entrada");
        int opcion = teclado.nextInt();

        //Paso 2. Seleccionar el tipo de entrada con sus respectivas prestaciones
        if(opcion == 1){
            
            //Entrada VIP
            System.out.println("Introduce el número de asiento");
            int asiento = teclado.nextInt();
            
            EntradaVIP entrada1 = new EntradaVIP(asiento, "Avatar", 8.50);
            
            System.out.println();
            
            entrada1.mostrarEntrada();
            
            
        }else if (opcion == 2){
            
            //Entrada básica
            System.out.println("Selecciona la fila: ");
            int fila = teclado.nextInt();
            
            EntradaBasica entrada2 = new EntradaBasica(fila, "Avatar", 7.50);
            
            System.out.println();
            
           entrada2.mostrarEntrada();
            
        }else{
            System.out.println("Opción no válida.");
        }
            
            teclado.close();
    }
    
}
