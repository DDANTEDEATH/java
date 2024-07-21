import java.util.Scanner;

public class SecuenciaCuadrados {
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

        // Inicializar el contador
        int i = 1;
        System.out.println("Cuadrados de los números desde 1 hasta " + numero + ":");

        // Imprimir los cuadrados de los números desde 1 hasta el número ingresado
        do {
            int cuadrado = i * i; // Calcular el cuadrado del número
            System.out.println("El cuadrado de " + i + " es: " + cuadrado);
            i++;
        } while (i <= numero);

        scanner.close();
    }
}
