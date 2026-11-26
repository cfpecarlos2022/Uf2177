package gestionentradas;


public class Principal {
    public static void main(String[] args) {
        
        //Creamos una entrada VIP
        EntradaVIP entrada1 = new EntradaVIP(15, "Avatar", 8.50);
        
        //Mostrar la información
        entrada1.mostrarEntrada();
    }
    
}
