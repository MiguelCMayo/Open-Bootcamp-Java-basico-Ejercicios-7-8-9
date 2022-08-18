package ejercicios_temas7_8_9;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MiPrograma {

    public static void main(String[] args) {

        MiPrograma2 prueba = new MiPrograma2();


    }

    public static class MiPrograma2 {
        public MiPrograma2() {

            int edad = 0;
            String nombre = " ";
            HashMap<Integer,String> datos = new HashMap<>();
            int arrayEdad[];
            arrayEdad = new int[3];
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


                Scanner edadIn2 = new Scanner(System.in);
                System.out.println("Introduce tu edad");
                edad = edadIn2.nextInt();
                Scanner nombreIn2 = new Scanner(System.in);
                System.out.println("Introduce tu nombre");
                nombre = nombreIn2.next();
                datos.put(edad, nombre);
                arrayEdad[1]= edad;


                Scanner edadIn3 = new Scanner(System.in);
                System.out.println("Introduce tu edad");
                edad = edadIn3.nextInt();
                Scanner nombreIn3 = new Scanner(System.in);
                System.out.println("Introduce tu nombre");
                nombre = nombreIn3.next();
                datos.put(edad, nombre);
                arrayEdad[2]= edad;

            }catch (InputMismatchException e){
                System.out.println("Datos incorrectos");
            }

            System.out.println(datos);

            for(int i=0; i<arrayEdad.length; i++){
                if(arrayEdad[i]>mayorEdad){
                    mayorEdad = arrayEdad[i];
                }
            }

            System.out.println("La persona de mas edad tiene: " + mayorEdad);






            /*
 for(int array : arrayEdad) {
                System.out.println(array);
            }







 for(int key : datos.keySet()){
                System.out.println(key);
                arrayEdad[]
            }



            for(int array : arrayEdad) {
                System.out.println(array);
            }*/




        }


    }
}
