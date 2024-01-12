package herencia;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 'M', 30, "Calle 1", 2000);
        System.out.println(empleado1);

        Cliente cliente1 = new Cliente("Maria", 'F', 25, "Calle 2", true, new Date());  
        System.out.println(cliente1);
    }
}
