//mi clase

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) throws Exception {
       
       System.out.println("Proporciona el titulo:");
       Scanner consola = new Scanner(System.in);
       String titulo= consola.nextLine();
       System.out.println("Proporciona el autor:");
       Scanner consola2 = new Scanner(System.in);
       String autor= consola2.nextLine();

       System.out.println( titulo +" fue escrito por "+ autor );
       
    }

}
