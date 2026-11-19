
package tiendainformatica2;


public class Producto {
    
    // Declaramos un método con retorno de tipo double
    // Recibe dos parámetros: precio y descuento
    public double calcularDescuento(double precio, double descuento) {
        
        //Calculamos el precio final después del descuento
        double resultado = precio -(precio * descuento/100);
        
        // Devolvemos el resultado al lugar donde se llamó al método
        return resultado;
    }
    
}
