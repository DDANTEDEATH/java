import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int suposicion = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número aleatorio entre 1 y 100.");
        System.out.println("Intenta adivinarlo.");

        // Repetir hasta que el usuario adivine el número correcto
        while (suposicion != numeroAleatorio) {
            // Pedir al usuario que ingrese una suposición
            System.out.print("Ingresa tu suposición: ");
            suposicion = scanner.nextInt();

            // Verificar si la suposición es demasiado alta, demasiado baja o correcta
            if (suposicion < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        }

        scanner.close();
    }
}
