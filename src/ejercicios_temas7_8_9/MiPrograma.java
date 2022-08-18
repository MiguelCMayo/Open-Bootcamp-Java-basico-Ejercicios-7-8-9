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

            String dni = " ";
            String nombre = " ";

            //Fase de introduccion de datos:
            try{
                Scanner dniIn = new Scanner(System.in);
                System.out.println("Introduce tu dni");
                dni = dniIn.next();
                Scanner nombreIn = new Scanner(System.in);
                System.out.println("Introduce tu nombre");
                nombre = nombreIn.next();
            }catch (InputMismatchException e){
                System.out.println("Datos incorrectos");
            }

            //Fase de guardar datos en un mapa:
            HashMap<String,String> cuenta = new HashMap<>();
            cuenta.put(dni, nombre);
            System.out.println(cuenta);






        }


    }
}
