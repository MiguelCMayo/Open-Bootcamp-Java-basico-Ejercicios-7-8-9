package ejercicios_temas7_8_9;

import java.io.*;
import java.util.Scanner;

public class CopyFile{

    public CopyFile(String fileIn, String fileOut){

        String texto = "";
        try{
            Scanner textoIn = new Scanner(System.in);
            System.out.println("Introduce el texto que quieres guardar en el fichero");

            PrintStream textoFichero = new PrintStream("fichero_prueba.txt");
            texto = textoIn.nextLine();
            textoFichero.write(texto.getBytes());

            InputStream ficheroIn = new FileInputStream(fileIn);
            byte[] datos = ficheroIn.readAllBytes();
            for(byte dato : datos){
                System.out.print((char) dato);

            }

            OutputStream ficheroOut = new FileOutputStream(fileOut);
            ficheroOut.write(datos);

            ficheroIn.close();
            ficheroOut.close();
            textoFichero.close();

            System.out.println("Enhorabuena, has creado y copiado el fichero!!");

        }catch (IOException e) {
            System.out.println("Error, no se ha podido realizar la copia");
        }
        System.out.println();

    }
}
