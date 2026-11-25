package herencia;

//Subclase o clase hija que hereda de la clase padre
public class Alumno extends Persona {
    
    //Atributo propio de ALumno
    String curso;
    
    //Método para mostrar el curso
    public void mostrarCurso(){
        
        System.out.println("Curso: " + curso);
    }
    
}
