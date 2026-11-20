package numeromayor;

import java.util.Scanner;

public class NumeroMayor {


    public static void main(String[] args) {
        
        //Paso 1. Creamos el objeto Scanner
        Scanner teclado = new Scanner(System.in);
        
        // Paso 2. Pedimos los dos números
        System.out.println("Introduce el primer número");
        int numero1 = teclado.nextInt();
        
         System.out.println("Introduce el segundo número");
        int numero2 = teclado.nextInt();
        
        // Paso 3. Utilizamos Math.max() para obtener el mayor
            int mayor = Math.max(numero1, numero2);
            
         // Paso 4. Comprobamos si los números son iguales
         if (numero1 == numero2){
             System.out.println("Los dos números son iguales");
         }else{
             System.out.println("EL número mayor es: " + mayor);
         }
         
         teclado.close();
         

    }
    
}
