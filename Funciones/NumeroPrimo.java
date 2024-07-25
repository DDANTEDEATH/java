import java.util.Scanner;

public class NumeroPrimo {

    // Función que determina si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
        // Revisamos si el número es divisible por algún número entre 2 y la raíz cuadrada de número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        // Si no es divisible por ningún número en el rango, es primo
        return true;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Por favor, ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si el número es primo y mostrar el resultado
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
