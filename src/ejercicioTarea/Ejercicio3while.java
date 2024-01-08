package ejercicioTarea;

public class Ejercicio3while {
    public static void main(String[] args) {
        int numero = 5;
        int limite = 10;
        int i = 1;

        System.out.println("Tabla del 5 hasta el producto de 5x10:");

        while (i <= limite) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
    }
}
