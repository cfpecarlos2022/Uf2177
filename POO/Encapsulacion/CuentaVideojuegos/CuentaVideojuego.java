
package encapsulacion;

public class CuentaVideojuego {
    
    //1. Atributo privado
    private int puntos;
    
    //2. Constructor
    public CuentaVideojuego(int puntos) {
        this.puntos = puntos;
    }

     // Getter: consultar los puntos
    public int getPuntos() {
        return puntos;
    }

    // Setter: modificar los puntos
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    
}
