package ejercicioTarea;

public class Ejercicio3for {
    public static void main(String[] args) {
        int numero = 5;
        int limite = 10;

        System.out.println("Tabla del 5 hasta el producto de 5x10:");


        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
