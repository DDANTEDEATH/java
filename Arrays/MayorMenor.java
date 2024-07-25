import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int mayor, menor;

        // Leer 8 números enteros desde el teclado
        System.out.println("Ingresa 8 números enteros:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializar mayor y menor con el primer elemento del array
        mayor = numeros[0];
        menor = numeros[0];

        // Determinar el número mayor y el número menor
        for (int i = 1; i < 8; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar el número mayor y el número menor en la consola
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}
