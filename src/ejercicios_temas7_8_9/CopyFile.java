package ejercicios_temas7_8_9;

import java.io.*;

public class CopyFile{

    public CopyFile(String fileIn, String fileOut){

        try{
            InputStream ficheroIn = new FileInputStream(fileIn);

            byte[] datos = ficheroIn.readAllBytes();

            for(byte dato : datos){
                System.out.print((char) dato);

            }

            OutputStream ficheroOut = new FileOutputStream(fileOut);
            ficheroOut.write(datos);

            ficheroIn.close();
            ficheroOut.close();

        }catch (IOException e) {
            System.out.println("Error, no se ha podido realizar la copia");
        }
        System.out.println();
        System.out.println("Enhorabuena, has copiado el fichero!!");
    }
}
