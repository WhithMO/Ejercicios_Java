public class Main {
    public static void main(String[] args) {
        int vidas = 3;
        char valor = 'a';       // Maximo aguanta 2 bytes
        String nombre = "George";

        System.out.println(vidas);
        System.out.println(valor);
        System.out.println(nombre);

        short num1 = 32767;
        byte num2 = 12;         // Maximo aguanta hasta el numero 127

        float num3 = 1.2F;
        double factor = 0.2323; // se usa para numeros decimales mas especificos

        String nombre1 = "";
        String apellido = "";
        byte edad = 2;
        String ciudad = "Lima";
        float altura = 1.9f;

        System.out.println("Mi nombre es " + nombre1 + " y mi apellido es " + apellido + ", mi edad es " + edad + ", vivo por " + ciudad + " y mido " + altura);

        float num5 = 10;
        float num4 = 4;

        System.out.println("El are es: " + (num5 / num4));


    }
}