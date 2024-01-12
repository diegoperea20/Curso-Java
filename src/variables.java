public class variables {
    
    public static void main(String[] args) throws Exception {
       String Cadena = "Hola";
       int numero_int = 20;
       float numeroFloat = 20f;
       float numeroFloat2 = (float) 20;
       boolean bandera = true;
       char caracter = '\u0021';//solo es un caracter en unicode
     

        int numero_cadena = Integer.parseInt("20");
        float numero_cadena2 = Float.parseFloat("20");
        float numero_cadena3 = Float.parseFloat(numero_int+"");
        String numero_cadena4 = Integer.toString(20);

       System.out.println("Cadena: "+Cadena);
       System.out.println("Entero: "+numero_int);
       System.out.println("Float: "+numeroFloat);
       System.out.println("Float segunda forma: "+numeroFloat2);
       System.out.println("Boolean: "+bandera);
       System.out.println("Caracter: "+caracter);
       System.out.println("-------------------");
       System.out.println("cadena a entero: "+numero_cadena);
       System.out.println("cadena a float: "+numero_cadena2);
       System.out.println("int a float: "+numero_cadena3);
       System.out.println("int a cadena: "+numero_cadena4);
       System.out.println("recorrido de la cadena: "+Cadena.charAt(0));
       
    }
}
