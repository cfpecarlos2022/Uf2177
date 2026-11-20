package comprobar.edad;

//Vamos a crear un programa que solicite al usuario su edad y compruebe si es mayor o menor de edad.
import java.util.Scanner;

public class ComprobarEdad {

    public static void main(String[] args) {
        // Paso 1. Crear el Scanner
        Scanner teclado = new Scanner(System.in);

        //Paso 2. Crear la estructura try-catch para gestionar los errores
        try {

            //Paso 3.Solicitar información
            System.out.println("Instroduzca su edad: ");
            int edad = teclado.nextInt();

            //Paso 4. Comprobar la edad
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");

            }else{
                System.out.println("Eres menor de edad");
            }
        }catch (Exception e){
            //Paso 5. Mostrar mensaje de error
            System.out.println("Error: debe introducir un número");
        }

        teclado.close();
    }

}
