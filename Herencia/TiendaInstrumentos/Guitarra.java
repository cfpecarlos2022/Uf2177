package herencia;

//Clase hija que hereda de la clase padre(Instrumento)
public class Guitarra extends Instrumento{
    
    @Override
    public void tocar(){
        System.out.println("La guitarra está tocando una melodía");
    }
    
}
