import java.util.Scanner;

public class ConvertirAMayusculas {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicitar al usuario que ingrese una palabra o cadena de texto
            System.out.print("Por favor, ingrese una palabra o cadena de texto (o una cadena vacía para terminar): ");
            String entrada = scanner.nextLine();

            // Verificar si la entrada es una cadena vacía
            if (entrada.isEmpty()) {
                break;
            }

            // Convertir la entrada a mayúsculas
            String mayusculas = entrada.toUpperCase();

            // Imprimir la entrada convertida a mayúsculas
            System.out.println("Texto en mayúsculas: " + mayusculas);
        }

        // Cerrar el objeto Scanner
        scanner.close();

        // Mensaje de finalización del programa
        System.out.println("Programa terminado.");
    }
}
