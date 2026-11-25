package herencia;

//Clase Perro hereda atributos y métodos de Animal

public class Perro extends Animal {
    
    //Atributo propio
    String raza;
    
    //Método propio
    public void ladrar(){
        System.out.println("El perro está ladrando");
    }
    
}
