package manejoarchivos;

import java.io.*;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        try (PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo))) {
            salida.println(contenido);
            System.out.println("Se ha escrito al archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        try (PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo, true))) {
            salida.println(contenido);
            System.out.println("Se ha anexado información al archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try (BufferedReader entrada = new BufferedReader(new FileReader(archivo))) {
            String lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
