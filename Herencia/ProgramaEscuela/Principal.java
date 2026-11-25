package herencia;


public class Principal {
    public static void main(String[] args) {
        
        //Crear objeto de la clase ALumno
        Alumno miAlumno = new Alumno();
        
        //Asignar valores a los atributos heredados
        miAlumno.nombre="Carlos";
        miAlumno.apellidos="Arias Miranda";
        
        // Asignar valor al atributo propio
        miAlumno.curso="Curso SQL";
        
        //Ejecutar los métodos
        System.out.println("---DATOS DEL ALUMNO---");
        miAlumno.mostrarDatos();
        
        
        
    }
    
}
