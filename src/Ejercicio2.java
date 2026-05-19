import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Variable
        int numero;
        int contador = 0;

        System.out.println("--- Números pares entre 0 y un número ingresado ---");

        // Pedimos el número
        System.out.print("Ingrese un número entero: ");
        numero = scanner.nextInt();

        // Ciclo while
        while (contador <= numero) {

            // Verificamos si el número es par
            if (contador % 2 == 0) {

                System.out.println(contador);

            }

            // Incrementamos el contador
            contador++;
        }

        // Cerramos scanner
        scanner.close();
    }
}