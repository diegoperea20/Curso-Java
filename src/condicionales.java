
//Mi clase en Java
public class condicionales {

    public static void main(String args[]) {
        //conditional if
        int a = 8;
        int valorMinimo = 0;
        int valorMaximo = 10;
        
        boolean resultado = a >= 0 && a <= 10;
        if(resultado){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }
        
        boolean vacaciones = false;
        boolean diaDescanso = true;
        
        if( vacaciones || diaDescanso){
            System.out.println("Padre puede asisitir al juego del hijo");
        }
        else{
            System.out.println("El padre esta ocupado");
        }

        //conditional if de otra forma ternario
        String ternario = (3>2) ? "verdadero" : "falso";
        System.out.println(ternario);

        //conditional else if
        int numero_else_if = 1;
        if(numero_else_if == 1){
            System.out.println("Es 1");
        }
        else if(numero_else_if == 2){
            System.out.println("Es 2");
        }
        else{
            System.out.println("No es 1 ni 2");
        }

        //conditional switch
        int numero_switch = 1;
        switch (numero_switch) {
            case 1:
                System.out.println("Es 1");
                break;
            case 2:
                System.out.println("Es 2");
                break;
            default:
                System.out.println("No es 1 ni 2");
                break;
        }

        //conditional while
        int numero_while = 0;
        while (numero_while < 3) {
            System.out.println("numero_while = " + numero_while);
            numero_while +=1;
        }

        //conditional for
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        //conditional for each  (no se puede usar los indices como edad[i])
        int edades[] = {10, 20, 30, 40, 50};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
    }
}
