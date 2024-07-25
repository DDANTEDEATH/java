import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        // Leer 5 números enteros desde el teclado
        System.out.println("Ingresa 5 números enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular la suma de todos los elementos
        for (int i = 0; i < 5; i++) {
            suma += numeros[i];
        }

        // Mostrar la suma en la consola
        System.out.println("La suma de los elementos es: " + suma);

        scanner.close();
    }
}
