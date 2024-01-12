package clases;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    //private boolean eliminado;
    //private static contadorPersonas;

    //variables de clase
    int varibale=10;
    float variable2=10.0f;

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        //contadorPersonas++; 
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Getters y Setters para boolean
//     public boolean isEliminado() {
//         return eliminado;
//     }
//
//     public void setEliminado(boolean eliminado) {
//         this.eliminado = eliminado;
//     }

    // Métodos
    public void saludar() {
        System.out.println("Hola " + nombre + " " + apellido);
    }

    public int saludarEdad(int edad) {
        System.out.println("Tu edad: " + edad);
        return edad;
    }
}
