public class Arreglonodefinido {
    
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        variosParametros("pedro",1,2,3,4,5,6,7,8,9,10);
    }

    private static void variosParametros(String nombre ,int... numeros) {
        System.out.println("Hola "+nombre);
        imprimirNumeros(numeros);
        
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
