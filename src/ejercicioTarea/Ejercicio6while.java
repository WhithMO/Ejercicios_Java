package ejercicioTarea;

import java.util.Scanner;

public class Ejercicio6while {
    public static void main(String[] args) {
        System.out.println("Cuadrados perfectos hasta 100:");

        int i = 1;
        while (i * i <= 100) {
            int cuadrado = i * i;
            System.out.println(cuadrado);
            i++;
        }
    }
}
