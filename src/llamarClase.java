
import clases.Persona;
public class llamarClase {
    //llama a clase Persona y sus metodos de clases
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pedro2", "Perez2");
        persona1.saludar();
        persona1.saludarEdad(30);
        persona1=cambioValor(persona1);
        persona1.saludar();
    
    }

    public static Persona cambioValor(Persona persona){
       persona.setNombre("Juan"); 
       persona.setApellido("Gomez");
       return persona;
    }
}
