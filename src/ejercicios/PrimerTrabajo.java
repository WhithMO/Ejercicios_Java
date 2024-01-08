package ejercicios;

public class PrimerTrabajo {
    double radio = 10.0; //
    double area = calcular(radio);
//    System.out.println("El área del círculo con radio " + radio + " es: " + area);


    public static double calcular(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

}
