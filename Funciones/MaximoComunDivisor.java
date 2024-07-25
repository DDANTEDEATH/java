import java.util.Scanner;

public class MaximoComunDivisor {

    // Función que determina el máximo común divisor de dos números
    public static int calcularMCD(int a, int b) {
        // Utilizamos el algoritmo de Euclides para calcular el MCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números enteros
        System.out.print("Por favor, ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Por favor, ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Calcular el MCD de los dos números
        int mcd = calcularMCD(numero1, numero2);

        // Mostrar el resultado
        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
