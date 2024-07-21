import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero;

        System.out.println("Ingrese números positivos uno por uno.");
        System.out.println("Para terminar, ingrese un número negativo.");

        while (true) {
            // Pedir al usuario que ingrese un número
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            // Verificar si el número es negativo para terminar
            if (numero < 0) {
                break;
            }

            // Sumar el número a la suma total y aumentar el contador
            suma += numero;
            contador++;
        }

        // Calcular la media de los números positivos ingresados
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números positivos ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close();
    }
}
