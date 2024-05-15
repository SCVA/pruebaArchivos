/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion20241.pruebaarchivos;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author SCVA9
 */
public class PruebaArchivos {

    public static void main(String[] args) {
        File directorioData = new File("..\\pruebaArchivos\\src\\main\\java\\programacion20241\\pruebaarchivos\\data");
        File archivoInicial = new File("..\\pruebaArchivos\\src\\main\\java\\programacion20241\\pruebaarchivos\\data\\prueba.txt");
        if(archivoInicial.exists()){
            System.out.println("El archivo ya existe");
        }else{
            System.out.println("El archivo no existe");
            try {
                if(!directorioData.exists()){
                    directorioData.mkdir();
                }
                archivoInicial.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el archivo");
            }
        }
        try {
            Scanner lectorArchivo = new Scanner(archivoInicial);
            int i=0;
            while(lectorArchivo.hasNext()){
                System.out.println("Contenido en la linea "+ i+" "+lectorArchivo.nextLine());
                i++;
            }
            PrintStream escritorArchivo = new PrintStream(archivoInicial);
            escritorArchivo.println("Sebastian Camilo Vanegas Ayala");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no se encuentra");
        }
        
    }
}
