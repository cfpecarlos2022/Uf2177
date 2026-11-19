package principal;

public class Principal {
    
    public static void main(String[] args) {
        
        //3. Crear un objeto de clase Vehículo
        Vehiculo vehiculo1 = new Vehiculo();
        
        //4.   // Llamamos al método enviando dos argumentos
        
        vehiculo1.mostrarVehiculo("Coche", + 40000);
        
        vehiculo1.mostrarVehiculo("Moto", 15000);
        
    }
    
}
