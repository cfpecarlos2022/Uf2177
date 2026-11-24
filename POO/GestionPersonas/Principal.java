package persona;

public class Principal {

    public static void main(String[] args) {

        // Crear objeto
        Persona miPersona = new Persona();

        // Asignar valores a los atributos
        miPersona.nombre = "Carlos";
        miPersona.edad = 30;
        miPersona.ciudad = "Sevilla";

        // Mostrar información
        miPersona.mostrarInformacion();

        System.out.println();

        // Saludar
        miPersona.saludar();

        // Cumplir años
        miPersona.cumplirAnios();

        // Mostrar nueva edad
        System.out.println("Nueva edad: " + miPersona.edad);

    }

}
