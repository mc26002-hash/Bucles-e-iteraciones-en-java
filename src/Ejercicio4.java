import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        int numero1;
        int numero2;
        int suma;
        String respuesta = "si";

        System.out.println("--- Suma repetitiva de dos números ---");

        // Ciclo while
        while (respuesta.equalsIgnoreCase("si")) {

            // Pedimos el primer número
            System.out.print("Ingrese el primer número: ");
            numero1 = scanner.nextInt();

            // Pedimos el segundo número
            System.out.print("Ingrese el segundo número: ");
            numero2 = scanner.nextInt();

            // Calculamos la suma
            suma = numero1 + numero2;

            // Mostramos el resultado
            System.out.println("La suma es: " + suma);

            // Preguntamos si desea continuar
            System.out.print("¿Desea realizar otra suma? (si/no): ");
            respuesta = scanner.next();
        }

        System.out.println("Programa finalizado.");

        // Cerramos scanner
        scanner.close();
    }
}