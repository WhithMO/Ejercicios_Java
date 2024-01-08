package ejercicioTarea;

import java.util.Scanner;

public class Ejercicio4while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= numero) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
