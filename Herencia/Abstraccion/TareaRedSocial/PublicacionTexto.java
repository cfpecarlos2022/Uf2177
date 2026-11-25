
package abstraccion;
//Clase hija que hereda de la clase abstracta Publicacion

public class PublicacionTexto extends Publicacion {
    
    public PublicacionTexto(String usuario, String mensaje){
        
        super(usuario, mensaje);
    }
    
    @Override
    public void mostrarPublicacion(){
        System.out.println("USUARIO: " + usuario);
        System.out.println("PUBLICACIÓN TEXTO: " + mensaje);
    }
}
