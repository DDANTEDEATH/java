import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Calcular el factorial del número
        long factorial = calcularFactorial(numero);

        // Imprimir el resultado
        System.out.println("El factorial de " + numero + " es " + factorial);
        
        scanner.close();
    }

    // Método para calcular el factorial de un número
    public static long calcularFactorial(int numero) {
        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
