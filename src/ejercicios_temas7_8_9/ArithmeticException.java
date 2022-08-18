package ejercicios_temas7_8_9;

import java.util.Scanner;

public class ArithmeticException extends Exception {
    private static final long serialVersionUID = 1L;

    public ArithmeticException(String errorMessage) {
        super(errorMessage);
    }


    static void DividePorCero() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if(numero2 == 0 || numero1 == 0){
            throw new ArithmeticException("No puede dividirse entre 0");
        }

        int resultado = numero1 / numero2;
        System.out.println("El resultado es: " + resultado);


    }


}