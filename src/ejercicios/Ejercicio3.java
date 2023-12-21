package ejercicios;

public class Ejercicio3 {
    public static double calcular(double radio) {
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        return volumen;
    }

    public static void main(String[] args) {
        double radio = 5; // cambiar numero a resolver
        double resultado = calcular(radio);
        System.out.println("El volumen de la esfera con radio " + radio + " es: " + resultado);
    }
}
