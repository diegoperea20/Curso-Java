package Enumeraciones;

public class TestDias {
    public static void main(String[] args) {
        System.out.println("Dia 1" + Dias.Lunes);
        mostrarDia(Dias.Lunes);
    }

    private static void mostrarDia(Dias dias) {
        switch (dias) {
            case Lunes:
                System.out.println("Lunes");
                break;
            case Martes:
                System.out.println("Martes");
                break;
            case Miercoles:
                System.out.println("Miercoles");
                break;
            case Jueves:
                System.out.println("Jueves");
                break;
            case Viernes:
                System.out.println("Viernes");
                break;
            case Sabado:
                System.out.println("Sabado");
                break;
            case Domingo:
    }}
}
