package cuentabancaria;


public class Principal {
    
    public static void main(String[] args) {
        
       //Paso 5. Crear un objeto
       CuentaBancaria cuenta1 = new CuentaBancaria();
       
       //Paso 6. Asignar valores a los atributos
       cuenta1.titular="Carlos";
       cuenta1.saldo=500;
       
       // Mostrar las acciones (Métodos)
       cuenta1.mostrarSaldo();
       cuenta1.ingresarDinero();
       cuenta1.mostrarSaldo();

    }
    
}
