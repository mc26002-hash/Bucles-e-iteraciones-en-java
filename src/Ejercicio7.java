import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Variable
        int numero;

        System.out.println("--- Tabla de multiplicar ---");

        // Pedimos el número
        System.out.print("Ingrese un número natural: ");
        numero = scanner.nextInt();

        // Ciclo for
        for (int i = 1; i <= 10; i++) {

            // Calculamos la multiplicación
            int resultado = numero * i;

            // Mostramos la tabla
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Cerramos scanner
        scanner.close();
    }
}