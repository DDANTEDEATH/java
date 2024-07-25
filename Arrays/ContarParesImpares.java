import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int cuentaPares = 0;
        int cuentaImpares = 0;

        // Leer 10 números enteros desde el teclado
        System.out.println("Ingresa 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contar números pares e impares
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                cuentaPares++;
            } else {
                cuentaImpares++;
            }
        }

        // Mostrar los conteos en la consola
        System.out.println("Cantidad de números pares: " + cuentaPares);
        System.out.println("Cantidad de números impares: " + cuentaImpares);

        scanner.close();
    }
}
