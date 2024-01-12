public class Arreglos {
    public static void main(String[] args) {
        //arreglo de enteros forma dinamica
        int[] edades = new int[5];
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;
        edades[3] = 40;
        edades[4] = 50;
        System.out.println(edades[0]);

        //recorremos el arreglo
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }

        //arreglo string
        String[] nombres = {"Juan", "Maria", "Pedro"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        //arreglo de enteros forma sencilla
        int[] edades2 = {10, 20, 30, 40, 50};
        for (int i = 0; i < edades2.length; i++) {
            System.out.println(edades2[i]);
        }


        //areglos con for each (no se puede usar los indices como edad[i])
        int[] edades3 = {10, 20, 30, 40, 50};
        for (int edad : edades3) {
            System.out.println("for each: " + edad);
            
        }
    }


    
}
