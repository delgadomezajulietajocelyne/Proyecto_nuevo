/**
 * @(#)Archivo.java
 *
 *
 * @author
 * @version 1.00 2013/9/2
 */

import java.io.*;
import java.util.Scanner;

public class Archivo {

    String ruta;

    public Archivo(String r) {
    	ruta = r;
    }

    public static void main(String[] args) {
       String path;
       Scanner leer = new Scanner(System.in);

       System.out.print("Ingresa la ruta del archivo: ");
       path = leer.nextLine();
	   System.out.println();
       Archivo miarch = new Archivo(path);

       try{
            //Abro
            FileInputStream fichero = new FileInputStream(miarch.ruta);
            // Creo mi objeto de entrada
            DataInputStream entrada = new DataInputStream(fichero);
            // Creo Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));

            String strLinea;

            while ((strLinea = buffer.readLine()) != null)   {
                System.out.println (strLinea);
            }
            // Cerrar el archivo
            entrada.close();
        }catch (Exception e){
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }
}
