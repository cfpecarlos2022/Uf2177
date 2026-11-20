package tablamultiplicar;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Paso 4. Creamos el objeto Scanner
        Scanner teclado = new Scanner(System.in);

        // Paso 5. Solicitamos un número
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        //Paso 6.  Creamos un objeto de la clase TablaMultiplicar
        TablaMultiplicar tabla1 = new TablaMultiplicar();
        
        // Paso 4. Llamamos al método y enviamos un argumento
        tabla1.mostrarTabla(numero);
        
         teclado.close();
    }
    


}
