import java.util.Scanner;

public class ControlPublicaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Bucle for para repetir el proceso 5 veces
        for (int i = 1; i <= 5; i++) {
            // 2. Solicitar al usuario el número de "Me gusta"
            System.out.print("Introduce los Me gusta de la publicación " + i + ": ");
            int meGusta = scanner.nextInt();

            // 3. Estructura condicional if-else para comprobar los resultados
            if (meGusta >= 50) {
                System.out.println("¡Publicación popular!");
            } else {
                System.out.println("La publicación todavía necesita más interacción");
            }
            
            System.out.println(); // Línea en blanco para separar las iteraciones
        }

        // 4. Mensaje final al completar el análisis
        System.out.println("Análisis de publicaciones finalizado.");

        scanner.close();
    }
}