import java.util.Scanner;

public class InvertirElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        // Leer 6 números enteros desde el teclado
        System.out.println("Ingresa 6 números enteros:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Invertir el orden de los elementos
        for (int i = 0; i < 3; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[5 - i];
            numeros[5 - i] = temp;
        }

        // Mostrar el array invertido en la consola
        System.out.println("El array invertido es:");
        for (int i = 0; i < 6; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
