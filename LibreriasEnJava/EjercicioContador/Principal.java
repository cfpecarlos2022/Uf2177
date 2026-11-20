package ejerciciocontador;

import java.util.Scanner;


public class Principal {
    
     // Paso 1. Creamos el Scanner
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       // Paso 2. Solicitamos un número
        System.out.println("Introduce un número: ");
       int numero = teclado.nextInt();
       
       // Paso 3. Creamos un objeto de la clase Contador
        Contador contador1 = new Contador();
        
        // Paso 4. Llamamos al método y enviamos el argumento
        contador1.contador(numero);
        
        teclado.close();
       
       
    }
    
}
