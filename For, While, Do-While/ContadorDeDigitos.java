import java.util.Scanner;

public class ContadorDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Contar cuántos dígitos tiene el número
        int cantidadDigitos = contarDigitos(numero);

        // Imprimir el resultado
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
        
        scanner.close();
    }

    // Método para contar cuántos dígitos tiene un número
    public static int contarDigitos(int numero) {
        // Si el número es negativo, se convierte a positivo
        if (numero < 0) {
            numero = -numero;
        }

        // Si el número es 0, tiene 1 dígito
        if (numero == 0) {
            return 1;
        }

        // Contar los dígitos
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
}
