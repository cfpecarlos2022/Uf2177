package cuentabancaria;

// crear una cuenta bancaria que almacene el nombre del titular y el saldo disponible. 
//Además, tendrá métodos para ingresar dinero, retirar dinero y mostrar el saldo.
public class CuentaBancaria {
    
    // Paso1. Atributos
    String titular;
    double saldo;
    
     // Paso 2. Método para ingresar dinero
    public void ingresarDinero(){
        
        // Ingreso quevamos a efecturar
        saldo = saldo + 100;
 
        System.out.println("Has ingresado 100 euros");
    }
    
    // Paso 3. Método para retirnar dinero
    public void retirarDinero(){
        saldo = saldo -50;
        
        System.out.println("Has retirado 50 euros.");
    }
    
    //Paso 4. Método para mostrar información
    public void mostrarSaldo(){
        
        System.out.println("Titular: " + titular);
        
        System.out.println("Saldo actual: " + saldo + " euros");
    }
    
    
}
