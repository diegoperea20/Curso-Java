package herencia;

public class Empleado extends Persona {
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    
    //Constructor
    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }

    //Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

   

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Metodo toString , cuando imprimes un objeto de esta clase se imprimira esto
    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                ", "  + super.toString() + '\'' +
                '}';
    }
}
