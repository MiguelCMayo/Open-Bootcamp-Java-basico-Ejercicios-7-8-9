package ejercicios_temas7_8_9;

import java.util.Scanner;

public class NameFormatException extends Exception {
    private static final long serialVersionUID = 1L;

    public NameFormatException(String errorMessage) {
        super(errorMessage);
    }


    static void DividePorCero() throws NameFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if(numero2 == 0 || numero1 == 0){
            throw new NameFormatException("Esto no puede hacerse");
        }

        int resultado = numero1 / numero2;
        System.out.println("El resultado es: " + resultado);


    }


}