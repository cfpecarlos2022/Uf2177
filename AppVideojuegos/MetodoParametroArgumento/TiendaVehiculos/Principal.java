package principal;

public class Principal {
    
    public static void main(String[] args) {
        
        //Paso 3. Llamar al método enviando dos argumentos
        mostrarVehiculo("Coche", 30000);
        
        mostrarVehiculo("Moto", 15000);
        
        mostrarVehiculo("Camión", 150000);
        
        
    }
    
    //1. Creamos el método con dos parámetros
    public static void mostrarVehiculo(String tipoVehiculo, double precio){
        
        //2. Desarrollar el método: Motrar la información del vehículo
        System.out.println("Tipo de vehículo: " + tipoVehiculo);
        System.out.println("Precio: " + precio + " €");
        System.out.println("--------------------------------------------");
    }
    
}
