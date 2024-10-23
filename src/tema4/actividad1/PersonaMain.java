package tema4.actividad1;

public class PersonaMain {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre(""); // nombre is set to empty string
        persona.setApellido(""); // apellido is set to empty string
        persona.setEdad(10);
        System.out.println("fullName= " + persona.getFullName());
        System.out.println("adolescente= " + persona.esAdolescente());
        persona.setNombre("Patri"); // nombre is set to Patri
        persona.setEdad(18);
        System.out.println("fullName= " + persona.getFullName());
        System.out.println("adolescente = " + persona. esAdolescente ());
        persona.setApellido("Guerrero"); // se establece apellido a Guerrero
        System.out.println("fullName= " + persona.getFullName());
    }
}
