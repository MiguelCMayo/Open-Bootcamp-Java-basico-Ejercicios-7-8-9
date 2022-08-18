package ejercicios_temas7_8_9;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MiPrograma {
    public static class EdadMayor {
        public EdadMayor() {

            int edad = 0;
            String nombre = " ";
            HashMap<Integer,String> datos = new HashMap<>();
            int arrayEdad[]= new int[3];
            String arrayNombre[]= new String[3];

            int mayorEdad = 0;

            try{

                Scanner edadIn1 = new Scanner(System.in);
                System.out.println("Introduce tu edad");
                edad = edadIn1.nextInt();
                Scanner nombreIn1 = new Scanner(System.in);
                System.out.println("Introduce tu nombre");
                nombre = nombreIn1.next();
                datos.put(edad, nombre);
                arrayEdad[0]= edad;
                arrayNombre[0]= nombre;

                Scanner edadIn2 = new Scanner(System.in);
                System.out.println("Introduce tu edad");
                edad = edadIn2.nextInt();
                Scanner nombreIn2 = new Scanner(System.in);
                System.out.println("Introduce tu nombre");
                nombre = nombreIn2.next();
                datos.put(edad, nombre);
                arrayEdad[1]= edad;
                arrayNombre[1]= nombre;

                Scanner edadIn3 = new Scanner(System.in);
                System.out.println("Introduce tu edad");
                edad = edadIn3.nextInt();
                Scanner nombreIn3 = new Scanner(System.in);
                System.out.println("Introduce tu nombre");
                nombre = nombreIn3.next();
                datos.put(edad, nombre);
                arrayEdad[2]= edad;
                arrayNombre[2]= nombre;

            }catch (InputMismatchException e){
                System.out.println("Datos incorrectos");
            }

            System.out.println("Datos del mapa:\n" + datos + "\n");

            for(int i=0; i<arrayEdad.length && i<arrayNombre.length; i++){
                if(arrayEdad[i]>mayorEdad){
                    mayorEdad = arrayEdad[i];
                }
            }

            for(HashMap.Entry <Integer,String> pair : datos.entrySet()){
                if(mayorEdad == pair.getKey()){
                    System.out.println("La persona de mayor edad tiene " + pair.getKey() + " años y se llama " + pair.getValue());
                }
            }
        }
    }
}
