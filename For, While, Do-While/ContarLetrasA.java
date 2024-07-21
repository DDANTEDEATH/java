import java.util.Scanner;

public class ContarLetrasA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una palabra
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        // Contar cuántas veces aparece la letra 'a'
        int contador = contarLetrasA(palabra);

        // Imprimir el resultado
        System.out.println("La letra 'a' aparece " + contador + " veces en la palabra \"" + palabra + "\".");
        
        scanner.close();
    }

    // Método para contar cuántas veces aparece la letra 'a' en una palabra
    public static int contarLetrasA(String palabra) {
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') { // Contar tanto 'a' minúscula como 'A' mayúscula
                contador++;
            }
        }

        return contador;
    }
}
