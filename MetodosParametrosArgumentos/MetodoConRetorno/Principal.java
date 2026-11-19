package tiendainformatica2;


public class Principal {
    
    public static void main(String[] args) {
        //Paso 1. Crear un objeto de la clase Producto
        Producto producto1 = new Producto();
        
        //Paso 2. Llamamos al método y enviamos los dos argumentos
        // Devolvemos el resultado al lugar donde se llamó al método
        double precioFinal = producto1.calcularDescuento(800, 20);
        
        //Paso 3. Mostramos el resultado
        System.out.println("Precio final: " + precioFinal + " euros");
    }
    
}
