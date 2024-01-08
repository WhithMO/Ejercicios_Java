package ejercicioTarea;

public class Ejercicio2while {
    public static void main(String[] args) {
        int sumaImpares = 0;
        int numero = 1;


        while (numero <= 100) {
            if (numero % 2 != 0) {
                sumaImpares += numero;
            }
            numero++;
        }

        System.out.println("La suma de los números impares del 1 al 100 es: " + sumaImpares);
    }
}
