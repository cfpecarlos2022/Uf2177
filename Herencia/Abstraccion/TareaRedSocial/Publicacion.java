package abstraccion;
// Clase Abstracta

public abstract class Publicacion {
    
    //Paso 1. Creamos una clase abstracta llamada Publicacion con dos atributos y un método abstracto.
    protected String usuario;
    protected String mensaje;
    
    // Paso 2. Crear Constructor: para inicializar los atributos cuando se crea un objeto de una clase hija.

    public Publicacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }
    
    
    public abstract void mostrarPublicacion();
    
    
    
    
}
