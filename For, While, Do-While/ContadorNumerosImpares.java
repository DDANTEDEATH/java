import java.util.Scanner;

public class ContadorNumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Pedir al usuario que ingrese un número entero positivo
        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("El número debe ser positivo. Por favor, intente de nuevo.");
            }
        } while (numero <= 0);

        // Imprimir los números impares desde 1 hasta el número ingresado
        int i = 1;
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        do {
            if (i % 2 != 0) { // Verificar si el número es impar
                System.out.println(i);
            }
            i++;
        } while (i <= numero);

        scanner.close();
    }
}
