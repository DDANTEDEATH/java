import java.util.Scanner;

public class CalcularRaizCuadrada {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Por favor, ingrese un número: ");
        double numero = scanner.nextDouble();

        // Calcular la raíz cuadrada del número
        double raizCuadrada = Math.sqrt(numero);

        // Imprimir la raíz cuadrada
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
