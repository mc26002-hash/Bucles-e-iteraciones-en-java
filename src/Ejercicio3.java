import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        int numero1;
        int numero2;

        System.out.println("--- Mostrar números pares entre dos números ---");

        // Pedimos el primer número
        System.out.print("Ingrese el primer número entero: ");
        numero1 = scanner.nextInt();

        // Pedimos el segundo número
        System.out.print("Ingrese el segundo número entero: ");
        numero2 = scanner.nextInt();

        // Determinamos el número menor y mayor
        int inicio = Math.min(numero1, numero2);
        int fin = Math.max(numero1, numero2);

        // Ciclo while
        while (inicio <= fin) {

            // Verificamos si el número es par
            if (inicio % 2 == 0) {

                System.out.println(inicio);

            }

            // Incrementamos el contador
            inicio++;
        }

        // Cerramos scanner
        scanner.close();
    }
}