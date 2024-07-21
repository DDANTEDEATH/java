import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el primer número de la secuencia
        System.out.print("Ingrese el primer número de la secuencia: ");
        int primerNumero = scanner.nextInt();

        // Leer la diferencia entre los números
        System.out.print("Ingrese la diferencia entre los números: ");
        int diferencia = scanner.nextInt();

        // Leer el número máximo hasta el cual la secuencia debe continuar
        System.out.print("Ingrese el número máximo hasta el cual la secuencia debe continuar: ");
        int numeroMaximo = scanner.nextInt();

        // Inicializar el número actual como el primer número
        int numeroActual = primerNumero;

        // Generar y mostrar la secuencia aritmética usando un bucle do-while
        System.out.println("Secuencia aritmética:");

        do {
            // Mostrar el número actual
            System.out.println(numeroActual);

            // Calcular el siguiente número en la secuencia
            numeroActual += diferencia;
        } while (numeroActual <= numeroMaximo);

        scanner.close();
    }
}
