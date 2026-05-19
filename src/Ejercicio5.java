import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        int numero;
        int suma = 0;
        String respuesta;

        System.out.println("--- Suma de números ingresados ---");

        // Ciclo do while
        do {

            // Pedimos un número
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            // Sumamos el número
            suma = suma + numero;

            // Preguntamos si desea continuar
            System.out.print("¿Desea ingresar otro número? (si/no): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("si"));

        // Mostramos la suma total
        System.out.println("La suma total de los números ingresados es: " + suma);

        // Cerramos scanner
        scanner.close();
    }
}