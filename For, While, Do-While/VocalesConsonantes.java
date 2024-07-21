import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        System.out.println("Ingrese letras para verificar si son vocales o consonantes.");
        System.out.println("El programa terminará cuando ingrese un espacio.");

        while (true) {
            System.out.print("Ingrese una letra: ");
            letra = scanner.next().charAt(0);

            // Verificar si el usuario ingresó un espacio
            if (letra == ' ') {
                break;
            }

            // Verificar si la letra es una vocal
            if (esVocal(letra)) {
                System.out.println("La letra '" + letra + "' es una vocal.");
            } else {
                System.out.println("La letra '" + letra + "' es una consonante.");
            }
        }

        System.out.println("Programa terminado.");
        scanner.close();
    }

    // Método para verificar si una letra es una vocal
    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra); // Convertir la letra a minúscula para facilitar la comparación
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
