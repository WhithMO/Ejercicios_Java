package ejercicios;

public class Ejercicio2 {
    public static double celsiusaFaren(double celsius) {
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        double celsius = 10; //ingresa el monto a convertir
        double resultado = celsiusaFaren(celsius);
        System.out.println(celsius + " grados Celsius equivale a " + resultado + " grados Fahrenheit.");
    }

}
