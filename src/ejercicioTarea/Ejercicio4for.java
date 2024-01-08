package ejercicioTarea;

import java.util.Scanner;
public class Ejercicio4for {
    public static void main(String[] args) {

        System.out.print("Ingresa un número para calcular su factorial: ");
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int resultado = 1;

        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;
        }

        System.out.println("El factorial de" + numero + " es: " + resultado);

    }
}
