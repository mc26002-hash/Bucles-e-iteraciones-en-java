import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        double compra;
        double descuento = 0;
        double totalPagar;
        String etiqueta;

        // Ciclo for que se ejecuta una sola vez
        for (int i = 1; i <= 1; i++) {

            System.out.println("--- Calcular descuento por etiqueta ---");

            // Pedimos el monto de la compra
            System.out.print("Ingrese el monto de la compra: ");
            compra = scanner.nextDouble();

            // Pedimos el color de la etiqueta
            System.out.print("Ingrese el color de la etiqueta (verde, roja, azul, dorada): ");
            etiqueta = scanner.next().toLowerCase();

            // Evaluamos el color de la etiqueta
            switch (etiqueta) {

                case "verde":
                    descuento = compra * 0.05;
                    break;

                case "roja":
                    descuento = compra * 0.10;
                    break;

                case "azul":
                    descuento = compra * 0.15;
                    break;

                case "dorada":
                    descuento = compra * 0.20;
                    break;

                default:
                    System.out.println("Etiqueta no válida.");
                    scanner.close();
                    return;
            }

            // Calculamos el total a pagar
            totalPagar = compra - descuento;

            // Mostramos resultados
            System.out.println("El descuento aplicado es: $" + descuento);
            System.out.println("El total a pagar es: $" + totalPagar);
        }

        // Cerramos scanner
        scanner.close();
    }
}