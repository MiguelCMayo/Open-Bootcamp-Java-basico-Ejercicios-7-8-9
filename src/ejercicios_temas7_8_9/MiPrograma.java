package ejercicios_temas7_8_9;

import java.util.HashMap;
import java.util.InputMismatchException;
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

            System.out.println("Este programa te pide la edad y el nombre de tres usuarios, los guarda en un mapa\n" +
                                " y a continuacion, mediante un array, te dice que usuario tiene mas edad.");
            try{

                Scanner edadIn1 = new Scanner(System.in);
                System.out.println("Introduce la edad del primer usuario");
                edad = edadIn1.nextInt();
                Scanner nombreIn1 = new Scanner(System.in);
                System.out.println("Introduce el nombre del primer usuario");
                nombre = nombreIn1.next();
                datos.put(edad, nombre);
                arrayEdad[0]= edad;
                arrayNombre[0]= nombre;

                Scanner edadIn2 = new Scanner(System.in);
                System.out.println("Introduce la edad del segundo usuario");
                edad = edadIn2.nextInt();
                Scanner nombreIn2 = new Scanner(System.in);
                System.out.println("Introduce el nombre del segundo usuario");
                nombre = nombreIn2.next();
                datos.put(edad, nombre);
                arrayEdad[1]= edad;
                arrayNombre[1]= nombre;

                Scanner edadIn3 = new Scanner(System.in);
                System.out.println("Introduce la edad del tercer usuario");
                edad = edadIn3.nextInt();
                Scanner nombreIn3 = new Scanner(System.in);
                System.out.println("Introduce el nombre del tercer usuario");
                nombre = nombreIn3.next();
                datos.put(edad, nombre);
                arrayEdad[2]= edad;
                arrayNombre[2]= nombre;

            }catch (InputMismatchException e){
                System.out.println("Datos introducidos incorrectos");
            }

            System.out.println("Los usuarios guardados en el mapa son:\n" + datos + "\n");

            for(int i=0; i<arrayEdad.length && i<arrayNombre.length; i++){
                if(arrayEdad[i]>mayorEdad){
                    mayorEdad = arrayEdad[i];
                }
            }

            for(HashMap.Entry <Integer,String> pair : datos.entrySet()){
                if(mayorEdad == pair.getKey()){
                    System.out.println("El usuario de mayor edad tiene " + pair.getKey() + " años y se llama " + pair.getValue());
                }
            }
        }
    }
}
