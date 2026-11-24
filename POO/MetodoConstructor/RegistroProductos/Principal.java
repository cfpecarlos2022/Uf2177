package producto;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Crear Scanner    
        Scanner teclado = new Scanner(System.in);

        // Solicitar datos del primer producto
        System.out.println("REGISTRO DEL PRIMER PRODUCTO");

        System.out.println("Introduce el nombre: ");
        String nombre1 = teclado.nextLine();

        System.out.println("Introduce la cantidad: ");
        int cantidad1 = teclado.nextInt();

        teclado.nextLine();

        // Crear primer objeto
        Producto producto1 = new Producto(nombre1, cantidad1);

        System.out.println();

        //Solicitar datos del segundo producto
        System.out.println("REGISTRO DEL SEGUNDO PRODUCTO");

        System.out.println("Introduce el nombre: ");
        String nombre2 = teclado.nextLine();

        System.out.println("Introduce la cantidad: ");
        int cantidad2 = teclado.nextInt();

        teclado.nextLine();

        // Crear primer objeto
        Producto producto2 = new Producto(nombre2, cantidad2);

        System.out.println();

        //Mostrar información
        System.out.println("LISTADO DE PRODUCTOS");
        System.out.println("PRIMER PRODUCTO");
        producto1.mostrarInformacion();

        System.out.println();

        System.out.println("SEGUNDO PRODUCTO");
        producto1.mostrarInformacion();

        teclado.close();
    }

}
