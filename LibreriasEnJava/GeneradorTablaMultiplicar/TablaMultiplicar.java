package tablamultiplicar;

// Caso Práctico: Generador de tablas de multiplicar
// El programa pedirá al usuario un número y mostrará su tabla de multiplicar del 1 al 10.

public class TablaMultiplicar {
    
    //Paso 1. Creamos el método que recibe un parámetro
    public void mostrarTabla(int numero){
        
        //Paso 2. Bucle for para repetir 10 veces
        for(int i=1; i <=10;i++){
            
         int resultado = numero * i;
         
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    
}
