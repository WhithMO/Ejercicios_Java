package ejercicioTarea;

import java.util.Scanner;

public class Ejercicio5for {
    public static void main(String[] args) {

        System.out.print("Ingresa un numero para sumar sus cifras: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int respuesta = sumarDigitos(n);
        System.out.println("La suma de sus cifras es: " + respuesta);
    }

    public static int sumarDigitos(int numero) {
        int suma = 0;

        for (; numero > 0; numero /= 10) {
            suma = suma + (numero % 10);
        }
        return suma;
    }
}
